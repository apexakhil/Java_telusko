class Hii implements Runnable
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
class Helloo implements Runnable
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
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hii obj1 = new Hii();
		Helloo obj2 = new Helloo();
		
		Thread t1 = new Thread(obj1); //obj1 to link start() and obj t1
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try { Thread.sleep(10); } catch (Exception e){}
		t2.start();
	}

}
