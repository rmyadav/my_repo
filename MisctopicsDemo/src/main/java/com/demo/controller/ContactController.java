package com.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping(value="api/contact/v1", produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact() {
		return new Contact("Tom", 123456);
	}

	@GetMapping(value="api/contact/v1", produces=MediaType.APPLICATION_JSON_VALUE, params="versionv1")
	public Contact getContactQueryV1() {
		return new Contact("Tom", 123456);
	}

	@GetMapping(value="api/contact/v1", produces=MediaType.APPLICATION_JSON_VALUE, headers="version=v1")
	public Contact getContactHeaderV1() {
		return new Contact("Tom", 123456);
	}




}
class Contact {
	private String name;
	private int mobile;
	public Contact() {}
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + "]";
	}
	
}