package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Generic_sort {

	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	
	   public static void main(String[]args) {
		   Double[]arr=new Double[5];
		   arr[0]=11.11;
		   arr[1]=23.2;
		   arr[2]=15.33;
		   arr[3]=20.44;
		   arr[4]=8.55;
		   
		   System.out.println("before sort :");
		   for(double d1:arr)
			   System.out.println(d1);
		   
		   DoublesortComparator sortComparator =new DoublesortComparator();
		   
		   Arrays.sort(arr,sortComparator);
		   System.out.println("After Sort by  name:");
		   for(double ele:arr)
			System.out.println(ele);
		   
		   
	   }
	   
	
	
}
