package java_learn;

class Calci
{
	int num1;
	int num2;
	
	public Calci()
	{
		num1=7;
		num2=11;
		System.out.println("Default constructor");
	}
	
	public Calci(int n)
	{
		num1=n;
		num2=n;
	}
	
	public Calci(int n, float f)
	{
		num1=n;
		num2=(int) f;
	}
}

public class ConstructDemo {

	public static void main(String[] args) {
		
		Calci obj = new Calci(11);
		System.out.println(obj.num1);
	

	}

}
