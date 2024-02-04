package com.newFlighdemo.newFlight_Reservation_app.entity;

import javax.persistence.Entity;

@Entity
public class Passenger extends AbstractEntity {
	
private String name;
private String email;
private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
