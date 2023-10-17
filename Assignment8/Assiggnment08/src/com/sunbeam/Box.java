/**
 * 
 */
package com.sunbeam;

public class Box <T extends Employee>
	{
		private T obj;
		public void set(T val)
		{
			this.obj=val;
			
	    }
		public T get()
		{
			return this.obj;
		}
		
		public float totalsalary()
		{
		return obj.calculateTotalSalary();
		}
		

 
	public static void main(String[] args) {
   
		Box<Manager>b1=new Box<>();
		Manager m1=new Manager();
		System.out.println("Enter the Managaer details");
		m1.accept();
	    b1.set(m1);
	    
	    System.out.println("manager id="+b1.get());
	   
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
	}
  }

