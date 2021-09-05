class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try { Thread.sleep(500); } catch (Exception e){}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(500); } catch (Exception e){}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start(); //to start the thread
		try { Thread.sleep(10); } catch (Exception e){} //to avoid collision
		obj2.start();
	}

}
