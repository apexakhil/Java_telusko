package com.telusko;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args)
	{
		Set<Integer> values = new HashSet<>();
//		Set<Integer> values = new TreeSet<>();

		values.add(954);
		values.add(621);
		values.add(154);
		values.add(245);
		
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
