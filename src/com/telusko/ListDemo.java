package com.telusko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<Integer>();
		List<Integer> val = new ArrayList<Integer>();
		val.add(1);
		val.add(2);
		val.add(3);
		val.add(4);
		
		values.add(96);
		values.add(53);
		values.add(17);
		values.add(2,42); //add(index,value) in List
		
		//values.add("gfc");
		//values.remove(1);
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i)); //get(index) in List
		}*/
		
//		Comparator<Integer> c = new Comparator<Integer>()
//				{
//					@Override
//					public int compare(Integer i, Integer j) 
//					{
//						return (i%10>j%10) ? 1:-1; //in sorting 1 means to swap and -1 means not to swap
//					}
//			
//				};
		
		//Comparator<Integer> c = (i,j)-> (i%10>j%10) ? 1:-1;  //lambda exp using ternary

		//Collections.sort(values,(i,j)-> (i%10>j%10) ? 1:-1); //Collections class has sort() which is static, c is obj of Comparator and is ued when we want to work with Comparator
//		Collections.reverse(values);//to reverse the elements
//		Collections.rotate(values, 2);
//		Collections.copy(val, values);
		
		for(Integer o:values) //for each loop
		{
			System.out.println(o);
		}
	}

}
