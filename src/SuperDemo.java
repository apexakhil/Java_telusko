class A
{
	public A()
	{
		System.out.println("in default A");
	}
	public A(int i)
	{
		System.out.println("in parameterised A");
	}
}
class B extends A
{
	public B()
	{
		super(3); //if we want to call the default of B and parameterised of A then pass parameter in super here
		System.out.println("in default B");	
	}
	public B(int i)
	{
		super(i); //by default it will call the default constructor from super class, to call parameterised constructor add parameter in super
		System.out.println("in parameterised B");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		
	}

}
