/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.lp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.cometd.bayeux.Channel;
import org.cometd.bayeux.ChannelId;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.bayeux.client.ClientSessionChannel.MessageListener;
import org.cometd.client.BayeuxClient;
import org.cometd.client.transport.ClientTransport;
import org.mule.api.callback.SourceCallback;
import org.mule.modules.box.BoxConnector;
import org.mule.modules.box.exception.BoxException;
import org.mule.modules.box.model.LongPollingServer;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class LongPollingClient extends BayeuxClient {
	
	private static final Logger logger = Logger.getLogger(LongPollingClient.class);
	
	private BoxConnector connector;
	private LongPollingServer server = null;
	private MessageListener messageListener = null;
	
	private static Map<String, Object> options(BoxConnector connector) {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(ClientTransport.TIMEOUT_OPTION, connector.getLongPollingTimeout());
		
		return Collections.unmodifiableMap(options);
	}
	
	public LongPollingClient(BoxConnector connector, LongPollingServer server) {
		super(server.getUrl(), BoxLongPollingTransport.create(connector, options(connector), server.getChannel()));
		this.connector = connector;
		this.server = server;
	}
	
	
	public synchronized void subscribe(final SourceCallback callback) {
		try {
			
			this.messageListener = new MessageListener() {
				
				@Override
				public void onMessage(ClientSessionChannel channel, Message message) {
					try {
						callback.process();
					} catch (Exception e) {
						logger.error(e);
					}
				}
			};
			
			getChannel(Channel.META_CONNECT).addListener(new ClientSessionChannel.MessageListener() {
	            public void onMessage(ClientSessionChannel channel, Message message) {
	                message.isSuccessful();
                }
            });
			this.getChannel("/*").subscribe(this.messageListener);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public synchronized void unsubscribe() {
		if (this.isConnected() && this.messageListener != null) {
			this.getChannel(this.server.getChannel()).unsubscribe(this.messageListener);
		}
	}
	
	@Override
	protected ChannelId newChannelId(String channelId) {
		return super.newChannelId(channelId);
	}
	
	@Override
	public void handshake() {
		super.handshake(this.connector.getLongPollingHandshakeTimeout());
		if (!this.isHandshook()) {
			throw new BoxException(String.format("Failed to handshake against server %s after %d ms", server.getHost(), this.connector.getLongPollingHandshakeTimeout()));
		}
	}
}
