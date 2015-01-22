
package com.example.payload;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


public class StringBody implements IPayloadBody {

    @XmlElement(name = "value")
    private String value = null;

    /**
     * Constructor.
     */
    public StringBody() {
        super();
    }
    @XmlTransient
    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public StringBody(String value) {
		super();
		this.value = value;
	}
    

}
