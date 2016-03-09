package com.isoft.dubbo.demo.user.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -1069732718104210886L;
	
	private String name;
	private String city;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
