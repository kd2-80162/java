package com.sunbeam; 

public class Student implements Comparable <Student>
{
	

	private int Rollno;
	private  String name;
	private  String city;
	private  double marks;
	
	
	public Student(int rollno, String name, String city, double marks) {
		super();
		Rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	public int getRollno() {
		return Rollno;
	}


	public void setRollno(int rollno) {
		Rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public int compareTo(Student other) {
	int diff=this.Rollno - other.Rollno;
	
		return diff;
	}


	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}


	
	
	
}

