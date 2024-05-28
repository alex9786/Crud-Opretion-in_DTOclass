package com.example.office.dto;

import jakarta.persistence.Column;

public class EbrainDto {
	
	private int id;
	private String name;
	private String work;
	
	
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
