/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.descriptor.UserDescriptor;

/**
 * 
 * Folders contain information about the items contained inside of them, including files and other folders.
 * There is also a set of metadata such as who owns the folder and when it was modified that is also returned.
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Folder extends Item {

	private static final long serialVersionUID = -4254960125347133726L;
	
	/**
	 * The time the folder was created
	 */
	private String createdAt;
	
	/**
	 * The time the folder or its contents were last modified
	 */
	private String modifiedAt;
	
	/**
	 * The description of the folder
	 */
	private String description;
	
	/**
	 * Whether this item is deleted or not
	 */
	private String itemStatus;
	
	/**
	 * The path of folders to this item, starting at the root
	 */
	private Entries paths;
	
	/**
	 * The folder size in bytes
	 */
	private Long size;
	
	/**
	 * The shared link for this folder
	 */
	private SharedLink sharedLink;
	
	/**
	 * The user who created this folder
	 */
	private UserDescriptor createdBy;
	
	/**
	 * The user who last modified this folder
	 */
	private UserDescriptor modifiedBy;
	
	/**
	 * The user who owns this folder
	 */
	private UserDescriptor ownedBy;
	
	/**
	 * The folder that contains this one
	 */
	private Item parent;
	
	/**
	 * Descriptors for folders and files contained in this folder
	 */
	private GetItemsResponse items;
	
	/**
	 * Whether this folder will be synced by the Box sync clients or not
	 */
	private String syncState;
	
	@XmlElement(name="sync_state")
	public String getSyncState() {
		return syncState;
	}
	
	public void setSyncState(String syncState) {
		this.syncState = syncState;
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
	
	@XmlElement(name="shared_link")
	public SharedLink getSharedLink() {
		return sharedLink;
	}
	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	
	@XmlElement(name="created_by")
	public UserDescriptor getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserDescriptor createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="modified_by")
	public UserDescriptor getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(UserDescriptor modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@XmlElement(name="owned_by")
	public UserDescriptor getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(UserDescriptor ownedBy) {
		this.ownedBy = ownedBy;
	}
	public Item getParent() {
		return parent;
	}
	public void setParent(Item parent) {
		this.parent = parent;
	}
	
	@XmlElement(name="item_collection")
	public GetItemsResponse getItems() {
		return items;
	}
	
	public void setItems(GetItemsResponse items) {
		this.items = items;
	}
	@XmlElement(name="item_status")
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	@XmlAttribute(name="path_collection")
	public Entries getPaths() {
		return paths;
	}
	public void setPaths(Entries paths) {
		this.paths = paths;
	}
	
}
