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
import cn.com.believer.songyuanframework.openapi.storage.box.functions.VerifyRegistrationEmailRequest;

/**
 * @author Jimmy
 * 
 */
public class VerifyRegistrationEmailRequestImpl extends BoxRequestImpl
        implements VerifyRegistrationEmailRequest {

    /** the email to verify. */
    private String loginName;

    /**
     * @return the loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @param loginName
     *            the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_VERIFY_REGISTRATION_EMAIL;
    }
}
