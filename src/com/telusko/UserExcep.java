package com.telusko;

import java.util.Scanner;

public class UserExcep {

	public static void main(String[] args) {
		System.out.println("Enter a no: ");
		Scanner sc = new Scanner(System.in); //creating obj of scanner and we need to paas an obj from where we are getting the input i.e. System.in
		int n=sc.nextInt();
		System.out.println(n);
		
		int i,j;
		i=8;j=9;
		try
		{
			int k=i/j;
			if (k==0)
				throw new TeluskoException("this is not possible"); //throwing our own exception
			System.out.println(k);
		}
		catch(TeluskoException e)
		{
			System.out.println("Error: "+e.getMessage()); //getMessage to print the error msg
		}
		
		
	}

}
