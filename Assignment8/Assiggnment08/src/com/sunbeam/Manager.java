package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee
{

	
	  private float bonus;
	private float comm;

	
	    Manager()
	    {
	        
	        this.bonus = 0;
	    }
	    Manager(float bonus)
	    {
	     this.bonus=bonus;
	    }
	 public float getbonus()
	    {
	        return this.bonus;
	    }
	    public void setbonus(float bonus)
	    {
	        this.bonus = bonus;
	    }
	    public void accept()
	    { Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the Bonus=");
	      
	      this.bonus=sc.nextFloat();
	      
	    }
	   public void display()
	    {
	      
	        System.out.println("Enter the bonus ="+this.bonus);
	        
	       
	    }
	 
	public float calculateTotalSalary() {
		// TODO Auto-generated method stub
		
		   {
			   return this.sal+ this.comm;
		   }
	}
}

	


