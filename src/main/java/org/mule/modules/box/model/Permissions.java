/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Permissions implements Serializable {

	private static final long serialVersionUID = 5764159592895329147L;
	
	private Boolean preview;
	private Boolean download;
	
	@XmlElement("can_preview")
	public Boolean isPreview() {
		return preview;
	}
	public void setPreview(Boolean preview) {
		this.preview = preview;
	}
	
	@XmlElement("can_download")
	public Boolean isDownload() {
		return download;
	}
	public void setDownload(Boolean download) {
		this.download = download;
	}
	
	
}
