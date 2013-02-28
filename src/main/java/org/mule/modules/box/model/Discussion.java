/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.descriptor.EntityDescriptor;

/**
 * Discussions are sets of comments related to a single folder.
 * Each folder can have multiple discussions, and discussions can contain multiple comments
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Discussion extends EntityDescriptor {
	
	private static final long serialVersionUID = -6017687026974352422L;
	
	/**
	 * The folder this discussion is related to
	 */
	private Item parent;
	
	/**
	 * The description of this discussion. 1024 chars max
	 */
	private String description;
	
	/**
	 * The user who created this discussion
	 */
	private UserInfo createdBy;
	
	/**
	 * The time this discussion was created
	 */
	private String createdAt;
	
	/**
	 * The time this discussion was last modified
	 */
	private String modifiedAt;
	
	public Item getParent() {
		return parent;
	}
	public void setParent(Item parent) {
		this.parent = parent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElement(name="created_by")
	public UserInfo getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserInfo createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="created_at")
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@XmlElement(name="modified_at")
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	
	

}
