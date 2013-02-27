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
import org.mule.modules.box.model.descriptor.FolderItem;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class File extends EntityDescriptor {
	
	private static final long serialVersionUID = 6127755562219178478L;
	
	private String description;
	private Long size;
	private String path;
	private String pathId;
	private String createdAt;
	private String modifiedAt;
	private String contentCreatedAt;
	private String contentModifiedAt;
	private String sha1;
	private String itemStatus;
	private SharedLink sharedLink;
	private UserInfo createdBy;
	private UserInfo modifiedBy;
	private UserInfo ownedBy;
	private FolderItem parent;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@XmlElement(name="path_id")
	public String getPathId() {
		return pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
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
	
	@XmlElement(name="content_created_at")
	public String getContentCreatedAt() {
		return contentCreatedAt;
	}
	public void setContentCreatedAt(String contentCreatedAt) {
		this.contentCreatedAt = contentCreatedAt;
	}
	
	@XmlElement(name="content_modified_at")
	public String getContentModifiedAt() {
		return contentModifiedAt;
	}
	public void setContentModifiedAt(String contentModifiedAt) {
		this.contentModifiedAt = contentModifiedAt;
	}
	@XmlElement(name="shared_link")
	public SharedLink getSharedLink() {
		return sharedLink;
	}
	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	
	@XmlElement(name="created_by")
	public UserInfo getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserInfo createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="modified_by")
	public UserInfo getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(UserInfo modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@XmlElement(name="owned_by")
	public UserInfo getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(UserInfo ownedBy) {
		this.ownedBy = ownedBy;
	}
	
	public FolderItem getParent() {
		return parent;
	}
	public void setParent(FolderItem parent) {
		this.parent = parent;
	}
	public String getSha1() {
		return sha1;
	}
	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}
	@XmlElement(name="item_status")
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	
}
