/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

/**
 * @author Jimmy
 * 
 */
public interface GetAuthTokenRequest extends BoxRequest {

    /**
     * @return the ticket
     */
    public String getTicket();

    /**
     * @param ticket
     *            the ticket to set
     */
    public void setTicket(String ticket);
}
