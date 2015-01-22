package com.example.payload;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;



public class DefaultPayload {

	@XmlElement
    private String meta ;
    
	@XmlAnyElement()
    private IPayloadBody payload_body;

	public void setPayload_body(IPayloadBody payload_body) {
		this.payload_body = payload_body;
	}
}
