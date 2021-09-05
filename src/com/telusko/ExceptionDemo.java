package com.telusko;

public class ExceptionDemo {

	private static final int[] a = null;

	public static void main(String[] args) {
		try
		{
			//int a[]=new int[5];
			int b[]=null;
			a[6]=7;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("val of k: "+k);
		}
		/*//catch(ArithmeticException | ArrayIndexOutOfBoundsException e) //this also works
		{
			
		}*/
		catch(ArithmeticException e)
		{
			System.out.println("Canot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index limit exceeds");
		}
		catch(Exception e) //this exception must be included at last 
		{
			System.out.println("Somethinng wrong");
		}
		finally
		{
			System.out.println("Bye");
		}

	}

}
