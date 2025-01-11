package com.data.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Stud_Dtls {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Stud_Address> addres;

	public Stud_Dtls() {
		super();
	}

	public Stud_Dtls(int id, String name, List<Stud_Address> addres) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
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

	public List<Stud_Address> getAddres() {
		return addres;
	}

	public void setAddres(List<Stud_Address> addres) {
		this.addres = addres;
	}

}
