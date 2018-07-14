package com.example.dto;

public class StudentDto {

	private int rollNo;
	private String name;

	public StudentDto() {
		// TODO Auto-generated constructor stub
	}

	public StudentDto(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDto [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
