package com.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp_Addresses {
	@Id
	private int id;
	private String address;

	public int getId() {
		return id;
	}

	public Emp_Addresses() {
		super();
	}

	public Emp_Addresses(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
