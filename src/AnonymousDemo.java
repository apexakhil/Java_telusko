class X
{
	public void show()
	{
		System.out.println("In X");
	}
}
//anonymous class does not have the name, its an alternative of overriding, can be used if we need that overriding once
public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new X()
				{
					public void show()
					{
						System.out.println("In Anonymous");
					}
				};
		obj.show();
	}

}
