/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class LongPollingServer implements Serializable {

	private static final long serialVersionUID = -3943814242297294748L;
	
	private static final String CHANNEL_REGEXP = ".*channel=(.*)&.*";
	private static final Pattern CHANNEL_PATTERN = Pattern.compile(CHANNEL_REGEXP);

	
	private static final String HOST_REGEXP = "(.*)/subscribe?.*";
	private static final Pattern HOST_PATTERN = Pattern.compile(HOST_REGEXP);
	
	
	private String type;
	private String url;
	private Integer ttl;
	private Integer maxRetries;
	private Integer retryTimeout;
	
	public String getChannel() {
		return this.get(this.url, CHANNEL_PATTERN);
	}
	
	public String getHost() {
		return this.get(this.url, HOST_PATTERN);
	}
	
	private String get(String value, Pattern pattern) {
		if (StringUtils.isBlank(value)) {
			throw new IllegalStateException("value is blank");
		}
		
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches() && matcher.groupCount() > 0) {
			return matcher.group(1);
		}
		
		throw new IllegalArgumentException(String.format("could not extract value from %s", value));
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getTtl() {
		return ttl;
	}
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}
	
	@XmlElement(name="max_retries")
	public Integer getMaxRetries() {
		return maxRetries;
	}
	public void setMaxRetries(Integer maxRetries) {
		this.maxRetries = maxRetries;
	}
	
	@XmlElement(name="retry_timeout")
	public Integer getRetryTimeout() {
		return retryTimeout;
	}
	public void setRetryTimeout(Integer retryTimeout) {
		this.retryTimeout = retryTimeout;
	}
	
	
}
