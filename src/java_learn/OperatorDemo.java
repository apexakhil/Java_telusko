package java_learn;

public class OperatorDemo {
	
	/*
	 * Arithmetic (+,-,*,/,%)
	 * Bitwise
	 * Relational
	 * Logical
	 */

	public static void main(String[] args)
	{
		int m=10, n=3;
		int r1=m+n;
		int r2=m-n;
		int r3=m*n;
		double r4=(double)m/n;
		int r5=m%n;
		m=n++; //post increment
		System.out.println("Post increment: "+m);
		m=++n; //pre increment
		System.out.println("Pre increment: "+m);
		
		System.out.println("Addition: "+r1);
		System.out.println("Subtraction: "+r2);
		System.out.println("Multiplication: "+r3);
		System.out.println("Division: "+r4);
		System.out.println("Modulus: "+r5);
		
	

	}

}
