
class Apple
{
	int a;
	public void show()
	{
		System.out.println("In Apple");
	}
}

class Ball extends Apple
{
	int i=11;
	public void show()
	{
		super.a=20; //assigning the value to var of super class but this value will be for Ball class
		super.show(); //to call the show method of parent
		System.out.println("In Ball"); //overriding a method of A
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball obj = new Ball();
		obj.show();
		System.out.println("a from Ball: "+obj.a);
		System.out.println("i from Ball: "+obj.i);
		Apple obj1 = new Apple();
		System.out.println("a from Apple: "+obj1.a);

	}

}
