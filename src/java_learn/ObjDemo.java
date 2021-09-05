package java_learn;

class Calc
{
	int num1;
	int num2;
	int res;
	
	public void perform()
	{
		res=num1+num2;
	}
}
public class ObjDemo {

	public static void main(String[] args) {

		Calc obj = new Calc(); //obj creation "class_name obj_name = new class_name()"
		obj.num1=7;
		obj.num2=11;
		
		obj.perform();
		
		System.out.println(obj.res);

	}

}
