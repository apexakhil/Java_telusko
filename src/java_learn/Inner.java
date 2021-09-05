package java_learn;

class Outer
{
	static int a=7; //static var
	public static void show() //static method
	{
		System.out.println("Inside outer class");
	}
	
	static class Inner  //static inner class //Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inside static Inner class");
		}
	}
	
	class Inner2
	{
		public void display()
		{
			System.out.println("Inside normal Inner class");
		}
	}
	
}

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer(); //creating instance of outer class
		obj.show();
		System.out.println(Outer.a); //printing the static var of Outer class (classname.var)
		
		Outer.Inner obj1 = new Outer.Inner(); //creating instance of inner static class
		obj1.display();

		Outer.Inner2 obj2 = obj.new Inner2(); //creating instance of normal inner class
		obj2.display();
	}

}
