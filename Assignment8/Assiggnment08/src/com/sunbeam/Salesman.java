package com.sunbeam;

import java.util.Scanner;

class Salesman extends Employee
	{

	    
		private float comm;

	    

	    Salesman()
	    {
	      
	        this.comm = comm;
	    }
	    Salesman(float comm)
	    {
	     
	        this.comm = comm;
	    }
	  public float getcomm()
	    {
	        return this.comm;
	    }
	   public void set_comm(float comm)
	    {
	        this.comm = comm;
	    }
	    public void accept()
	    {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enetr the Commission");
	       this.comm=sc.nextFloat();
	       
	      
	    }
	   public void display()
	    {
	      System.out.println("The commission is"+this.comm);
	        
	    }
	   public float calculateTotalSalary()
	   {
		   return this.sal+ this.comm;
	   }
	}

