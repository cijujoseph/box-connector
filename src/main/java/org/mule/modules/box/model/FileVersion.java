/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import javax.xml.bind.annotation.XmlAttribute;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.descriptor.EntityDescriptor;
import org.mule.modules.box.model.descriptor.UserDescriptor;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class FileVersion extends EntityDescriptor {
	
	private static final long serialVersionUID = -6217715633340403696L;
	
	private String sha1;
	private Long size;
	private String createdAt;
	private String modifiedAt;
	private UserDescriptor modifiedBy;
	
	public String getSha1() {
		return sha1;
	}
	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
	@XmlAttribute(name="created_at")
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@XmlAttribute(name="modified_at")
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	@XmlAttribute(name="modified_by")
	public UserDescriptor getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(UserDescriptor modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	

}
