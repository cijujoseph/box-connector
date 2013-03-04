/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import org.junit.Test;
import org.mule.modules.box.lp.LongPollingClient;
import org.mule.modules.box.model.LongPollingServer;

public class LongPollingTest {


	@Test
	public void poll() throws Exception {
		final LongPollingServer server = new LongPollingServer();
		server.setUrl("http://2.realtime.services.box.net/subscribe?channel=829daed45a76df1cdf51&stream_type=all");
		
		BoxConnector connector = new BoxConnector() {
			
			@Override
			public String getAccessToken() {
				return "kcNuedTKuwEl6NI6znLk2uR47HTIH5lu";
			}
			
		};
		
		
		
		
		LongPollingClient client = new LongPollingClient(connector, server);
		client.subscribe(null);
		
		Thread.sleep(1000*60*10);
	}
	
}
