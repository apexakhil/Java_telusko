package com.telusko.test;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.roll=9; //we can reassign the var if it is within same package
		//s.name="hgjgv"; //private var cant reassign
		s.marks=75; //protected can be reassigned within same package
		s.age=21;
	}

}
