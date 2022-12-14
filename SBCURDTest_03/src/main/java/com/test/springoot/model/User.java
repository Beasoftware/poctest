package com.test.springoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usr")
public class User {
	private Integer id;
	private String name;
	private long mobileno;
	private String email;
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, long mobileno, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
		this.address = address;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
