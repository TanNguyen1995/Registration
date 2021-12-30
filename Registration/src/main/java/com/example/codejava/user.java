package com.example.codejava;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
@Entity
@Table(name = "user")
public class user {
	@Id
	@Column(name = "ID", nullable = false, unique= true, length=100)
 private String ID;
	@Column(name = "password",nullable = false, unique= false, length=1000)
private String password;
	@Column(name = "email",nullable = false, unique= true, length=100)
 private String email;
	@Column(name = "username",nullable = false, unique= true, length=100)
 private String username;
	@Column(name = "phonenumber",nullable = false, unique= true, length=100)
 private String phonenumber;
	@Column(name = "address",nullable = false, unique = false, length=100)
 private String Address;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
