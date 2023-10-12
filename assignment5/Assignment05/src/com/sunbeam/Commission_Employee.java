package com.sunbeam;

import java.util.Scanner;

public class Commission_Employee extends Employees {
 private double gross_sales;
 private double commission_rate;
 private double commission;
@Override
public void calculateTotalCommission()
{
	this.commission=this.commission_rate * this.gross_sales;
}
 

public Commission_Employee()
{  
	this.gross_sales=0;
	this.commission_rate=0;
	this.commission=0;
}


public Commission_Employee(double gross_sales, double commission_rate) {
	super();
	this.gross_sales = gross_sales;
	this.commission_rate = commission_rate;
}


public double getGross_sales() {
	return gross_sales;
}


public void setGross_sales(double gross_sales) {
	this.gross_sales = gross_sales;
}


public double getCommission_rate() {
	return commission_rate;
}


public void setCommission_rate(double commission_rate) {
	this.commission_rate = commission_rate;
}


@Override
public void AcceptEmployees() {
	super.AcceptEmployees();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the GrossSale");
	this.gross_sales=sc.nextDouble();
	
	System.out.println("Enter the Commission");
	this.commission_rate=sc.nextDouble();
}


@Override
public void DisplayEmployees() {
	super.DisplayEmployees();
	
	System.out.println("The Gross Sale is ="+this.gross_sales);
	System.out.println("The Commission Rate ="+this.commission_rate);
}


@Override
public String toString() {
	return "Commission_Employee [gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + "]";
}
 

 
 
 
 
 
 
 
 
 
 
 
}
