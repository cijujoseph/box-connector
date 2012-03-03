/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

/**
 * @author Jimmy
 * 
 */
public interface PublicShareResponse extends BoxResponse {

    /**
     * @return the publicName
     */
    public String getPublicName();

    /**
     * @param publicName
     *            the publicName to set
     */
    public void setPublicName(String publicName);
}
