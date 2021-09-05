package com.telusko;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) 
	{
		Map<String,String> m = new HashMap<>();
//		Map<String,String> m = new HashTable<>();

		m.put("myName", "Akhil"); //put(key,value)
		m.put("company", "FIS");
		m.put("position", "IT Trainee");
		
		//System.out.println(m);
//		System.out.println(m.get("company")); //to get the value using key we use get(key) method
		
		Set<String> k = m.keySet(); //keySet() of Set Interface gives set of keys
		
		for(String key : k)
		{
			System.out.println(key+ " : " +m.get(key));
		}
	}

}
