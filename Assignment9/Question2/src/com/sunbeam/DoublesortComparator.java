package com.sunbeam;

import java.util.Comparator;

public class DoublesortComparator implements Comparator<Double>
{

	@Override
	public int compare(Double arg0, Double arg1) {
		int diff=arg0.compareTo(arg1);
		return diff;
	}

	

		
	
	
	

}
