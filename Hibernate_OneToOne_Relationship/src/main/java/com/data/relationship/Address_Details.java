package com.data.relationship;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	@Column(name = "address")
	private String city;
 
	@OneToOne(mappedBy = "address")
	private Student_Details st;
	public Address_Details() {
		super();
	}

	public Address_Details(int add_id, String city) {
		super();
		this.add_id = add_id;
		this.city = city;
	}

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student_Details getSt() {
		return st;
	}

	public void setSt(Student_Details st) {
		this.st = st;
	}
	

}
