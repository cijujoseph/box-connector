/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.descriptor.EntityDescriptor;

/**
 * The users endpoint is used for managing a user and its content.
 * For an individual user, this includes their own user information and content.
 * For an enterprise admin, this includes both the individual user and any other users in the admin’s enterprise account.
 * 
 * In many entities such as folder and file, there're references to this class. In those scenarios Box will
 * only send reduced versions of this class in which most fields will be null.
 * 
 * The following attributes are not provided by default and need to be specifically requested through a fields parameter:
 * 
 * trackingCodes,
 * canSeeManagedUsers,
 * isSyncEnabled
 * isExemptFromDeviceLimits
 * isExemptFromLoginVerification
 * enterprise
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class User extends EntityDescriptor {

	private static final long serialVersionUID = -5483075221771438061L;
	
	/**
	 * The time this user was created
	 */
	private String createdAt;
	
	/**
	 * The time this user was last modified
	 */
	private String modifiedAt;
	
	/**
	 * This user’s enterprise role.
	 */
	private Role role;
	
	/**
	 * The language of this user
	 */
	private String language;
	
	/**
	 * The email address this user uses to login
	 */
	private String login;
	
	/**
	 * The user’s total available space amount in bytes
	 */
	private Long spaceAmount;
	
	/**
	 * The amount of space in use by the user
	 */
	private Long spaceUsed;
	
	/**
	 * The maximum individual file size in bytes this user can have
	 */
	private Long maxUploadSize;
	
	/**
	 * An array of key/value pairs set by the user’s admin
	 */
	private List<Map<String, String>> trackingCodes;
	
	/**
	 * Whether this user can see other enterprise users in its contact list
	 */
	private Boolean canSeeManagedUsers;
	
	/**
	 * Whether or not this user can use Box Sync
	 */
	private Boolean isSyncEnabled;
	
	/**
	 * Can be active or inactive
	 */
	private UserStatus status;
	
	/**
	 * The user’s job title
	 */
	private String jobTitle;
	
	/**
	 * The user’s address
	 */
	private String address;
	
	/**
	 * URL of this user’s avatar image
	 */
	private String avatarUrl;
	
	/**
	 * Whether to exempt this user from Enterprise device limits
	 */
	private Boolean isExemptFromDeviceLimits;
	
	/**
	 * Whether or not this user must use two-factor authentication
	 */
	private Boolean isExemptFromLoginVerification;
	
	/**
	 * representation of this user’s enterprise, including the ID of its enterprise
	 */
	private EntityDescriptor enterprise;
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@XmlElement(name="space_amount")
	public Long getSpaceAmount() {
		return spaceAmount;
	}

	public void setSpaceAmount(Long spaceAmount) {
		this.spaceAmount = spaceAmount;
	}

	@XmlElement(name="space_used")
	public Long getSpaceUsed() {
		return spaceUsed;
	}

	public void setSpaceUsed(Long spaceUsed) {
		this.spaceUsed = spaceUsed;
	}

	@XmlElement(name="max_upload_size")
	public Long getMaxUploadSize() {
		return maxUploadSize;
	}

	public void setMaxUploadSize(Long maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlElement(name="tracking_codes")
	public List<Map<String, String>> getTrackingCodes() {
		return trackingCodes;
	}

	public void setTrackingCodes(List<Map<String, String>> trackingCodes) {
		this.trackingCodes = trackingCodes;
	}

	@XmlElement(name="can_see_managed_users")
	public Boolean getCanSeeManagedUsers() {
		return canSeeManagedUsers;
	}

	public void setCanSeeManagedUsers(Boolean canSeeManagedUsers) {
		this.canSeeManagedUsers = canSeeManagedUsers;
	}

	@XmlElement(name="is_sync_enabled")
	public Boolean getIsSyncEnabled() {
		return isSyncEnabled;
	}

	public void setIsSyncEnabled(Boolean isSyncEnabled) {
		this.isSyncEnabled = isSyncEnabled;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	@XmlElement(name="job_title")
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElement(name="avatar_url")
	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	@XmlElement(name="is_exempt_from_device_limits")
	public Boolean getIsExemptFromDeviceLimits() {
		return isExemptFromDeviceLimits;
	}

	public void setIsExemptFromDeviceLimits(Boolean isExemptFromDeviceLimits) {
		this.isExemptFromDeviceLimits = isExemptFromDeviceLimits;
	}

	@XmlElement(name="is_exempt_from_login_verification")
	public Boolean getIsExemptFromLoginVerification() {
		return isExemptFromLoginVerification;
	}

	public void setIsExemptFromLoginVerification(Boolean isExemptFromLoginVerification) {
		this.isExemptFromLoginVerification = isExemptFromLoginVerification;
	}
	
	public EntityDescriptor getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(EntityDescriptor enterprise) {
		this.enterprise = enterprise;
	}
	
	
}
