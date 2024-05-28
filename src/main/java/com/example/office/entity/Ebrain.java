package com.example.office.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ebrain_detail")

public class Ebrain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="e_id")
	private int id;
	
	@Column(name="e_name")
	private String name;
	
	@Column(name="work_detail")
	private String work;
	
	
	
	public Ebrain(int id, String name, String work) {
		super();
		this.id = id;
		this.name = name;
		this.work = work;
	}

	
	public Ebrain() {

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

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
