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
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import cn.com.believer.songyuanframework.openapi.storage.box.constant.BoxConstant;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetTicketRequest;

/**
 * @author Jimmy
 * 
 */
public class GetTicketRequestImpl extends BoxRequestImpl implements
        GetTicketRequest {

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_GET_TICKET;
    }

}
