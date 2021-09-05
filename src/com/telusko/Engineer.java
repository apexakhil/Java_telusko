package com.telusko;

import com.telusko.test.Student;

public class Engineer extends Student{

	public void show()
	{
		marks=95; //protected var can be accessed
		//age=15; //default var cant be accessed
	}
}
