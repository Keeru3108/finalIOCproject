package com.jspiders.pkg1;

public class User
{
   private String username;
   private Address homeAddress;
   
   private Address workAddress;
   
@Override
public String toString() {
	return "User [username=" + username + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public Address getWorkAddress() {
	return workAddress;
}
public void setWorkAddress(Address workAddress) {
	this.workAddress = workAddress;
}
   
}
