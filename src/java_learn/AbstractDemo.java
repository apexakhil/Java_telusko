package java_learn;

abstract class Writer
{
	int a=7;
	public abstract void novel(); //declaring methods as abstract
	
	public void poem()
	{
		System.out.println("Writer writes the poem");
	}
}

class Pen extends Writer //concrete class
{
	public void novel()
	{
		System.out.println("Writer writes novel with pen");
	}
}

class Pencil extends Writer //concrete class
{
	public void novel()
	{
		System.out.println("Writer writes the novel with pencil");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Writer obj = new Writer(); //can't create obj of abst class
		Writer obj = new Pen(); //we can create obj of Pen by referring to Writer 
		obj.novel();
		obj.poem();
		System.out.println(obj.a);
		
	}

}
