/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey;

import org.mule.RequestContext;
import org.mule.commons.jersey.RequestBehaviour;
import org.mule.modules.box.BoxConnector;

import com.sun.jersey.api.client.WebResource.Builder;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@SuppressWarnings("deprecation")
public class AuthBuilderBehaviour implements RequestBehaviour {

	private BoxConnector connector;
	
	public AuthBuilderBehaviour(BoxConnector connector) {
		this.connector = connector;
	}
	
	@Override
	public <T> Builder behave(Builder builder, String method, Class<T> entityClass) {
		return builder.header("Authorization", String.format("BoxAuth api_key=%s&auth_token=%s",
													this.connector.getApiKey(),
													this.connector.getAuthToken(RequestContext.getEvent().getMessage())));
	}
	

}
