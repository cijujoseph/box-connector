/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.lp;

import java.util.Map;

import org.cometd.client.transport.LongPollingTransport;
import org.eclipse.jetty.client.ContentExchange;
import org.eclipse.jetty.client.HttpClient;
import org.mule.modules.box.BoxConnector;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BoxLongPollingTransport extends LongPollingTransport {
	
	private BoxConnector connector;
	private String channel;
	
	public static BoxLongPollingTransport create(BoxConnector connector, Map<String, Object> options, String channel) {
	    HttpClient httpClient = new HttpClient();
	    httpClient.setIdleTimeout(5000);
	    httpClient.setConnectorType(HttpClient.CONNECTOR_SELECT_CHANNEL);
	    httpClient.setMaxConnectionsPerAddress(32768);
	    
	    return create(connector, options, httpClient, channel);
    }

    public static BoxLongPollingTransport create(BoxConnector connector, Map<String, Object> options, HttpClient httpClient, String channel) {
    	BoxLongPollingTransport transport = new BoxLongPollingTransport(connector, options, httpClient, channel);
        
    	if (!httpClient.isStarted()) {
            try {
                httpClient.start();
            }
            catch (Exception x) {
                throw new RuntimeException("Error starting http Client for long polling", x);
            }
        }
    	
        return transport;
    }

    public BoxLongPollingTransport(BoxConnector connector, Map<String, Object> options, HttpClient httpClient, String channel) {
        super(options, httpClient);
        this.connector = connector;
        this.channel = channel;
    }

    @Override
    protected void customize(ContentExchange exchange) {
        super.customize(exchange);
        exchange.addRequestHeader("Authorization", "Bearer " + this.connector.getAccessToken());
        exchange.getRequestFields().add("channel", this.channel);
    }

}
