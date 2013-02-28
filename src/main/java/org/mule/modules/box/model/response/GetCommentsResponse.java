/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.response;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.mule.modules.box.model.Comment;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetCommentsResponse implements Serializable {

	private static final long serialVersionUID = 898153858649940748L;
	
	private Long totalCount;
	private List<Comment> comments;
	
	@XmlElement(name="total_count")
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
