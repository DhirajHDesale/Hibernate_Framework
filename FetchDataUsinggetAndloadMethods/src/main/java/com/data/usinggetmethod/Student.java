package com.data.usinggetmethod;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "semail")
	private String mail;
	@Column(name = "addmissiondate")
	@Temporal(TemporalType.DATE)
	private Date date;

	public Student() {
		super();
	}

	public Student(int id, String name, String mail, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.date = date;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mail=" + mail + ", date=" + date + "]";
	}
	
	

}
