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
import org.mule.modules.box.model.descriptor.UserDescriptor;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Comment extends EntityDescriptor {

	private static final long serialVersionUID = 7670402222846957689L;
	
	private boolean isReplyComment;
	private String message;
	private UserDescriptor createdBy;
	private String createdAt;
	private FolderItem item;
	private String modifiedAt;
	
	@XmlElement(name="is_reply_comment")
	public boolean isReplyComment() {
		return isReplyComment;
	}
	public void setReplyComment(boolean isReplyComment) {
		this.isReplyComment = isReplyComment;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@XmlElement(name="created_by")
	public UserDescriptor getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserDescriptor createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="created_at")
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public FolderItem getItem() {
		return item;
	}
	public void setItem(FolderItem item) {
		this.item = item;
	}
	
	@XmlElement(name="modified_at")
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	
	
	
	
}
