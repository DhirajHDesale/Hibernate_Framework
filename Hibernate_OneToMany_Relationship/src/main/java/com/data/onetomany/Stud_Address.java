package com.data.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_address")
public class Stud_Address {
	@Id
	private int id;
	private String addresType;
	private String city;
	public Stud_Address() {
		super();
	}
	public Stud_Address(int id, String addresType, String city) {
		super();
		this.id = id;
		this.addresType = addresType;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddresType() {
		return addresType;
	}
	public void setAddresType(String addresType) {
		this.addresType = addresType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
