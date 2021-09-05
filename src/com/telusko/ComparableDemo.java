package com.telusko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
	int rollno, marks;
	String name;
	
	public Students(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Students s)
	{
		return name.length()>s.name.length() ? 1:-1; //
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) 
	{
		List<Students> stud = new ArrayList<Students>(); //list of student with <Students> type
		stud.add(new Students(1,"Phenom",80));
		stud.add(new Students(2,"Shlok",85));
		stud.add(new Students(3,"Ved",82));
		stud.add(new Students(4,"Rutvik",81));
		
		Collections.sort(stud,(i,j) -> i.marks>j.marks ? 1:-1); //this will sort list in terms of marks
		
		for(Students s: stud)
		{
			System.out.println(s); //it will call the toString()
		}
	}

}
