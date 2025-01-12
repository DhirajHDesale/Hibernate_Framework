package com.hql_language;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stud_Hql {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private Date addminssionDate;

	public Stud_Hql() {
		super();
	}

	public Stud_Hql(String name, String address, Date addminssionDate) {
		super();
		this.name = name;
		this.address = address;
		this.addminssionDate = addminssionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getAddminssionDate() {
		return addminssionDate;
	}

	public void setAddminssionDate(Date addminssionDate) {
		this.addminssionDate = addminssionDate;
	}

	@Override
	public String toString() {
		return "Stud_Hql [id=" + id + ", name=" + name + ", address=" + address + ", addminssionDate=" + addminssionDate
				+ "]";
	}

}
