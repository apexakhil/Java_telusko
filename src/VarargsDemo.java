
class Calc
{
	public int add(int ... n) //varargs
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc();
		System.out.println(obj.add(7, 11,56,87,56));
		

	}

}
