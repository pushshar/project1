package com.capgemini.beans;

public class Student {

	private int rollno;
	private String name;
	private int noc;
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	private Course[] enroll;
	public Course[] getEnroll() {
		return enroll;
	}
	public void setEnroll(Course[] enroll) {
		this.enroll = enroll;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}