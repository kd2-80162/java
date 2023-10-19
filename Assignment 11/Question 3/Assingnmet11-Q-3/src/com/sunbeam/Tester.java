package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		Set<Book>set=new TreeSet<>();
		set.add(new Book("S01",443.4,"Sardar",10));
		set.add(new Book("S01",443.4,"Sardar",10));   //When we trying to add duplicate values in isbn,It Accept those Values ...but if we want to avoid it then we have to use Comparable                                                 
		set.add(new Book("S014",443.4,"Sardar",10));
		set.add(new Book("S023",443.4,"Sardar",10));
		set.add(new Book("S013",443.4,"Sardar",10));
	    set.add(new Book("S044",443.4,"Sardar",10));

	    
	    
//	    for (Book book : set) 
//	    	System.out.println(book);
	    
	    Iterator<Book>itr=set.iterator();
	     while(itr.hasNext())
	     {
		   Book e=itr.next();
		   System.out.println(e);
	   }
		   
	    // Books are stored in Sorted code order 
		   
	    	
	    		}
	    
	    
	    
	    
}