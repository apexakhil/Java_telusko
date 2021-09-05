package com.telusko;

import com.telusko.test.Student; //or com.telusko.test.*; to import every class

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		// s.roll=9; //we cant reassign the var which is default
		s.roll=10; //now since var is public we can reassign it
		//s.age=23;
	}

}
