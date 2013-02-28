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
 * Collaborations are Box’s equivalent of access control lists.
 * They can be used to set and apply permissions for users to folders. 
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Collaboration extends EntityDescriptor {
	
	private static final long serialVersionUID = -9160092964332743659L;
	
	public static enum Status {
		accepted,
		pending,
		rejected
	}
	
	/**
	 * The user who created this collaboration
	 */
	private UserInfo createdBy;
	
	/**
	 * The time this collaboration was created
	 */
	private String createdAt;
	
	/**
	 * The time this collaboration was last modified
	 */
	private String modifiedAt;
	
	/**
	 * The time this collaboration will expire
	 */
	private String expiresAt;
	
	/**
	 * The status of this collab
	 */
	private Status status;
	
	/**
	 * The user who the collaboration applies to
	 */
	private UserInfo accessibleBy;
	
	/**
	 * The level of access this user has
	 */
	private String role;
	
	/**
	 * When the status of this collab was changed
	 */
	private String acknowledgedAt;
	
	/**
	 * The folder this discussion is related to
	 */
	private Item item;
	
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
	
	@XmlElement(name="expires_at")
	public String getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@XmlElement(name="accessible_by")
	public UserInfo getAccessibleBy() {
		return accessibleBy;
	}
	public void setAccessibleBy(UserInfo accessibleBy) {
		this.accessibleBy = accessibleBy;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@XmlElement(name="acknowledged_at")
	public String getAcknowledgedAt() {
		return acknowledgedAt;
	}
	public void setAcknowledgedAt(String acknowledgedAt) {
		this.acknowledgedAt = acknowledgedAt;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
