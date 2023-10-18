package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
	
		Student[]arr=new Student[5];
		arr[0]= new Student(20,"Gaurav","Lucknow",66.9);
		arr[1]=new Student(30,"Ashish","Manmad",55.2);
		arr[2]=new Student(80,"Pratik","Manmad",58.2);
		arr[3]=new Student(40,"yash","latur",45.88);
		arr[4]=new Student(16,"Majnuu","indore",52.2);
		
		System.out.println("Before sort:");
		
		for(Student e : arr)
			System.out.println(e);
		
		  Arrays.sort(arr);
		  
		  System.out.println("After the sorting");
		  for(Student e: arr)
			  System.out.println(e);
		
		
		  class CityMarksName implements Comparator <Student>{

			@Override
			public int compare(Student s1, Student s2) {
				
				int diff=s1.getCity().compareTo(s2.getCity());
				if(diff==0)
					
				 diff=Double.compare(s1.getMarks(),s2.getMarks());
				
				if(diff==0)
					
				diff=s1.getName().compareTo(s2.getName());
				
				if(diff==0);
				return diff;
					
					
			    
					
			
			}
			  
 		  }
		  System.out.println( );
		  
		  CityMarksName cc=new CityMarksName();
		  System.out.println("After sort");
		  
		  Arrays.sort(arr,cc);
		  for(Student ele: arr)
			  System.out.println(ele);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
