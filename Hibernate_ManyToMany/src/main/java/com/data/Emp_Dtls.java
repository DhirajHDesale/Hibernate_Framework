package com.data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp_Dtls {
	@Id
	private int empid;
	private String name;

	@ManyToMany
	private List<Emp_Addresses> addres;

	public Emp_Dtls() {
		super();
	}

	public List<Emp_Addresses> getAddres() {
		return addres;
	}

	public void setAddres(List<Emp_Addresses> addres) {
		this.addres = addres;
	}

	public Emp_Dtls(int empid, String name, List<Emp_Addresses> addres) {
		super();
		this.empid = empid;
		this.name = name;
		this.addres = addres;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
