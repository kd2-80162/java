package com.sunbeam;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		NavigableSet<Book>set= new TreeSet< >();
		set.add(new Book("S01",423.4,"Sardar",10));
		set.add(new Book("S01",343.4,"Raj",12));                                                     
		set.add(new Book("S014",222.4,"Mahesh",17));
		set.add(new Book("S023",45.3,"Titu",33));
		set.add(new Book("S013",267.7,"waikar",26));
	    set.add(new Book("S044",675.8,"Praduman",67));

	    
	    
//	    for (Book book : set) 
//	    	System.out.println(book);
	    
	    Iterator<Book>itr=set.iterator();  //display using iterator()
	     while(itr.hasNext())
	     {
		   Book e=itr.next();
		   System.out.println(e);
	   }
	     
	     
	     
	    
	     
	     
	     
	     Iterator<Book>itr1=set.descendingIterator(); //display using descendingIterator()
	     while(itr1.hasNext())
	     {
	    	 Book ele=itr1.next();
	    	 System.out.println(ele);
	     }
	
	    	
	    		}
	    
	    
	    
	    
}