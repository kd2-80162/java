package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private
	    int id;
	    float sal;

	public
	    Employee()
	    {
	        this.id = 0;
	        this.sal = 0;
	    }
	    Employee(int id, float sal)
	    {
	        this.id = id;
	        this.sal = sal;
	    }

	  public  int getId()
	    {
	        return this.id;
	    }

	  public  float getSal()
	    {
	        return this.sal;
	    }

	   public void setId(int id)
	    {
	        this.id = id;
	    }

	  public  void setSal(float sal)
	    {
	        this.sal = sal;
	    }

	   public void display()
	    {   
	       
	        System.out.println("Employee id=" +this.id);
	        System.out.println("Employee sal=" +this.sal);
	    }

	   public void accept()
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Employee Id");
	        this.id=sc.nextInt();
	       
	        System.out.println("Enter the Employee salary");
	        this.sal=sc.nextFloat();
	    }
	   abstract float calculateTotalSalary();
	}
   