package org.mumtaz.HelloRESTWorld.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private String hello;

	public Message() {
	}

	public Message(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
