/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.Access;
import org.mule.modules.box.model.Folder;
import org.mule.modules.box.model.Permissions;
import org.mule.modules.box.model.SharedLink;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateFolderRequest implements Serializable {
	
	private static final long serialVersionUID = 4122128323321447203L;

	/**
	 * 	The name of the folder
	 */
	private String name;
	
	/**
	 * 	The description of the folder
	 */
	private String description;
	
	/**
	 * 	The parent folder of this file
	 */
	private Folder parent;
	
	/**
	 * The ID of the parent folder
	 */
	private String parentId;
	
	/**
	 * An object representing this item’s shared link and associated permissions
	 */
	private SharedLink sharedLink;
	
	/**
	 * The level of access required for this shared link. Can be open, company, collaborators
	 */
	private Access access;
	
	/**
	 * The day that this link should be disabled at. Timestamps are rounded off to the given day.
	 */
	private String unsharedAt;
	
	/**
	 * the set of permissions that apply to this link
	 */
	private Permissions permissions;
	
	/**
	 * Whether this link allows downloads
	 */
	private boolean canDownload;
	
	/**
	 * Whether this link allows previews
	 */
	private boolean canPreview;
	
	/**
	 * The email-to-upload address for this folder
	 */
	private String folderUploadEmail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Folder getParent() {
		return parent;
	}

	public void setParent(Folder parent) {
		this.parent = parent;
	}

	@XmlAttribute(name="id")
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@XmlAttribute(name="shared_link")
	public SharedLink getSharedLink() {
		return sharedLink;
	}

	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}

	public Access getAccess() {
		return access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	@XmlAttribute(name="unshared_at")
	public String getUnsharedAt() {
		return unsharedAt;
	}

	public void setUnsharedAt(String unsharedAt) {
		this.unsharedAt = unsharedAt;
	}

	public Permissions getPermissions() {
		return permissions;
	}

	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}

	@XmlAttribute(name="permissions.download")
	public boolean isCanDownload() {
		return canDownload;
	}

	@XmlAttribute(name="permissions.preview")
	public void setCanDownload(boolean canDownload) {
		this.canDownload = canDownload;
	}

	public boolean isCanPreview() {
		return canPreview;
	}

	public void setCanPreview(boolean canPreview) {
		this.canPreview = canPreview;
	}

	@XmlAttribute(name="folder_upload_email")
	public String getFolderUploadEmail() {
		return folderUploadEmail;
	}

	public void setFolderUploadEmail(String folderUploadEmail) {
		this.folderUploadEmail = folderUploadEmail;
	}
	
}
