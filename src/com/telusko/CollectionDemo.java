package com.telusko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values = new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add("ABC"); //we can add any type of values in Collection Interface
		//values.remove(2);
		Iterator it = values.iterator(); //adding all the values of values in it
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		for(Object o:values)
//		{
//			System.out.println(o);
//		}
//		System.out.println(values);
}
}
