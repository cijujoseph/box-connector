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
import org.mule.modules.box.model.Event;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetEventsResponse implements Serializable {

	private static final long serialVersionUID = 6300584186867310130L;
	
	private Long chunkSize;
	private Long nextStreamPosition;
	private List<Event> entries;
	
	@XmlElement(name="chunk_size")
	public Long getChunkSize() {
		return chunkSize;
	}
	public void setChunkSize(Long chunkSize) {
		this.chunkSize = chunkSize;
	}
	
	@XmlElement(name="next_stream_position")
	public Long getNextStreamPosition() {
		return nextStreamPosition;
	}
	public void setNextStreamPosition(Long nextStreamPosition) {
		this.nextStreamPosition = nextStreamPosition;
	}
	public List<Event> getEntries() {
		return entries;
	}
	public void setEntries(List<Event> entries) {
		this.entries = entries;
	}
	
	
}
