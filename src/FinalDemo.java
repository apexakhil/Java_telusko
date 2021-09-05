
class A1
{
	final int a=0;//used for constants
	final int DAY; //we can declare n later assign
	public A1()
	{
		DAY=7; //now its final var7
		//a=11; //cant reassign a final var
	}
	
	public final void display()
	{
		System.out.println("in A");
	}
}

class A2 extends A1
{
	//public void display() //cant override final method
	{
		
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		System.out.println(obj.a);

	}

}
