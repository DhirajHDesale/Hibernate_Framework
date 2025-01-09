package com.data.first_program;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student3 {
	@Id
	private int id;
	private String sname;
	private String smail;
	private String city;

	public Student3() {
		super();
	}

	public Student3(int id, String sname, String smail, String city) {
		super();
		this.id = id;
		this.sname = sname;
		this.smail = smail;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
