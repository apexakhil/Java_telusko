interface Writer
{
	int num=7; //by default vars are final in interface
	public abstract void write(); //public abstract keywords are optional since every method is by default abstract
}

interface Writer2 extends Writer //one interface extends other interface
{
	void xyz();
}

class Pen implements Writer,Writer2 //to implement interface we use implements 
{
	public void write()
	{
		System.out.println("Im a Pen");
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(pc);
	
	}

}
