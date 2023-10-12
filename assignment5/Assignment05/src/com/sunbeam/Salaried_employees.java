package com.sunbeam;

import java.util.Scanner;

public class Salaried_employees extends Employees {

	private int fixed_weekly_salary;

	@Override
	public void calculateTotalCommission() 
	{
		
	}
	public Salaried_employees()
	{
		this.fixed_weekly_salary=0;
		
	}
	public Salaried_employees(int fixed_weekly_salary) {
		super();
		this.fixed_weekly_salary = fixed_weekly_salary;
	}
	public int getFixed_weekly_salary() {
		return fixed_weekly_salary;
	}
	public void setFixed_weekly_salary(int fixed_weekly_salary) {
		this.fixed_weekly_salary = fixed_weekly_salary;
	}
	@Override
	public void AcceptEmployees() {
		Scanner sc=new Scanner(System.in);
		super.AcceptEmployees();
		System.out.println("Enter Fixed Salaried Employees");
		this.fixed_weekly_salary=sc.nextInt();
	}
	@Override
	public void DisplayEmployees() {
        super.DisplayEmployees();
		System.out.println("The Fixed Salaried Employees are"+this.fixed_weekly_salary);
	}
	@Override
	public String toString() {
		return "Salaried_employees [fixed_weekly_salary=" + fixed_weekly_salary + "]";
	}
    
	
	
}
