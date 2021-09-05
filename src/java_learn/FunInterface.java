package java_learn;

interface ABC
{
	int a=7;
	void show();
	default void show2()  //we can define a method in interface with the help of default method
	{
		System.out.println("In ABC show2");
	}
}

interface ABC2
{
	default void show2()  
	{
		System.out.println("In ABC2 show2");
	}
}

class DefInt implements ABC, ABC2
{
	public void show()
	{
		System.out.println("In show");
	}

	@Override 			//second type to remove ambiguity
	public void show2() {
		// TODO Auto-generated method stub
		ABC.super.show2();  //it will call the show2 of ABC interface
		ABC2.super.show2(); //interface.super.method_name
	}
	
	/*public void show2()
	{
		System.out.println("In DefInt show2");
	}*/ //one type to remove ambiguity
	
}
public class FunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABC obj = () -> System.out.println("Interface obj can also be created using lambda exp"); //lambda exp only works with functional interface
		
		DefInt obj = new DefInt();
		obj.show();
		obj.show2();
		System.out.println(obj.a);


	}

}
