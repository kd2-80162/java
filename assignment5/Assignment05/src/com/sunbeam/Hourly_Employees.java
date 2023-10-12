package com.sunbeam;

import java.util.Scanner;

public class Hourly_Employees extends Employees {

	private double Hourly_wage;
	private int hours_worked ;
	
	
	
	@Override
	public void calculateTotalCommission() 
	{
		if(this.hours_worked<=40)
		{	this.Hourly_wage=this.Hourly_wage * this.hours_worked ;}
		else if(this.hours_worked>40)
		{
			this.Hourly_wage=40 * this.Hourly_wage +(this.hours_worked-40) * this.Hourly_wage *1.5;}
		}
			
			
	
    
	public Hourly_Employees()
	{
		this.Hourly_wage=0;
		this.hours_worked=0;
		
	}

	public Hourly_Employees(double hourly_wage, int hours_worked) {
		super();
		Hourly_wage = hourly_wage;
		this.hours_worked = hours_worked;
	}

	public double getHourly_wage() 
		return Hourly_wage;
	}

	public void setHourly_wage(double hourly_wage) {
		Hourly_wage = hourly_wage;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	@Override
	public void AcceptEmployees() {
		super.AcceptEmployees();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Hourly Wage");
		this.Hourly_wage=sc.nextDouble();
		
		System.out.println("Enter The Hours Worked ");
		this.hours_worked=sc.nextInt();
		
	}

	@Override
	public void DisplayEmployees() {
		
		super.DisplayEmployees();
		System.out.println("The Hourly Wage is "+this.Hourly_wage);
		
		System.out.println("The Hours Worked is "+this.hours_worked);
	}

	@Override
	public String toString() {
		return "Hourly_Employees [Hourly_wage=" + Hourly_wage + ", hours_worked=" + hours_worked + "]";
	}

	
	
	
	 
	
}
