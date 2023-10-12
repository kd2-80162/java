package com.sunbeam;

import java.util.Scanner;

public class Employee {
private String first_name;
private String last_name;
private double monthly_salaray;
private double yearly_salary ;
public Employee()
{
	String first_name=" ";
	String last_name="";
	double monthly_salaray=0;
	double yearly_salary  = 0;
}

public Employee(String first_name, String last_name, double monthly_salaray ,double yearly_salary ) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.monthly_salaray = monthly_salaray ;
	this.yearly_salary = yearly_salary ;
     
    
} 

    
    public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public double getMonthly_salaray() {
	return monthly_salaray;
}

public void setMonthly_salaray(double monthly_salaray) {
	this.monthly_salaray = monthly_salaray;
}



	public double getYearly_salary() {
	return yearly_salary;
}

public void setYearly_salary(double yearly_salary) {
	this.yearly_salary = yearly_salary;
}

	public void acceptEmployee()
    {
    	 Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first name ");
    	this.first_name = sc.next();
    	
    	
    	
    	System.out.println("Enter last name ");
    	this.last_name = sc.next();
    	
    	
    	System.out.println("Enter monthly salary ");
    	this.monthly_salaray = sc.nextDouble();
    	if(monthly_salaray > 0)
    		setMonthly_salaray(monthly_salaray);
    	else 
    		setMonthly_salaray(0) ;
    	
    		
    }
	
	public void yearlySalary()
	{
	   System.out.println(" Yearly salary = " + this.monthly_salaray * 12);	
	}
	
	public void raiseSalary()
	{
		System.out.println(" salary after increment ");
		setMonthly_salaray(monthly_salaray * 1.1);
	}
	
	
	
//	 first_name;
//	 private String last_name;
//	 private double monthly_salaray;
	public void displayEmployee()
	{
		System.out.println(" first_name = " + this.first_name);
		
		System.out.println("last name = "+this.last_name);
		System.out.println(" Monthly  salary= " + this.monthly_salaray);
		raiseSalary();
		System.out.println(" Yearly  salary= " + this.monthly_salaray * 12 );
		
	}
	
	
	
}



