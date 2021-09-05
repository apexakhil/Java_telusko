class Calc1  //super,base,parent
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class Calc2 extends Calc1 //sub,derived,child
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class Calc3 extends Calc2 //grand child
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc3 obj = new Calc3();
		System.out.println(obj.add(11, 7));
		System.out.println(obj.sub(11, 7));
		System.out.println(obj.mul(11, 7));
				
				
	}

}
