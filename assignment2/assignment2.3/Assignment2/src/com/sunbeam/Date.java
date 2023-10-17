/*Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/


package com.sunbeam;

import java.util.Scanner;

public class Date 
{
 private int day;
 private int month;
 private int year;
 
 
 
 public Date()
 {

	 this.day=0;
	 this.month=0;
	 this.year=0;
 }



public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}



public int getDay() {
	return day;
}



public void setDay(int day) {
	this.day = day;
}



public int getMonth() {
	return month;
}



public void setMonth(int month) {
	this.month = month;
}



public int getYear() {
	return year;
}



public void setYear(int year) {
	this.year = year;
}


public void Acceptdate()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Information");
	
	System.out.println("Enter day");
	this.day=sc.nextInt();
	
    System.out.println("Enter Month");
    this.month=sc.nextInt();
    
    System.out.println("Enter year");
    this.year=sc.nextInt();
}

public void displaydate()
{
	System.out.println("The information of Date is" + this.day + " / " + this.month+" / "+this.year);
	
	System.out.println("The date is="+this.day);
	
	System.out.println("The month is ="+this.month);
	
	System.out.println("The year is="+ this.year);
	
	
	
}



@Override
public String toString() {
	return "Date [day=" + day + " / " + month + "/ " + year + "]";
}















}
