
class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	public void show()
	{
		System.out.println(eid+ " : " +salary+ " : " +ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp a = new Emp();
		a.eid= 123;
		a.salary=45678;
		a.ceo="Rutvik";
		
		Emp b = new Emp();
		b.eid=456;
		b.salary=78945;
		b.ceo="Rutvik";
		
		b.ceo="Adwit"; //we can class_name.var as well
		
		Emp.ceo="Shlok";
		
		a.show();
		b.show();

	}

}
