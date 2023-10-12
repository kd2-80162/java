package com.sunbeam;

import java.util.Scanner;

abstract public class Employees {

	private String firstName;
	private String lastName;
	private int SSN;

	abstract public void calculateTotalCommission();

	public Employees() {
		this.firstName = " ";
		this.lastName = " ";
		this.SSN = 0;

	}

	public Employees(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void AcceptEmployees() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name");
		this.firstName = sc.next();

		System.out.println("Enter the last name");
		this.lastName = sc.next();

		System.out.println("Enter the Social Security Number");
		this.SSN=sc.nextInt();

	}

	public void DisplayEmployees() {
		System.out.println("The Employee information is");

		System.out.println("The first name is=" + this.firstName);

		System.out.println("The Last name iss=" + this.lastName);

		System.out.println("The Social Security Number=" + this.SSN);

	}

}