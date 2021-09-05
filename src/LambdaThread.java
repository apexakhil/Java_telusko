
public class LambdaThread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try { Thread.sleep(500); } catch (Exception e){}
			}
		}); //obj1 to link start() and obj t1
		
		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try { Thread.sleep(500); } catch (Exception e){}
			}
		});
		
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.start();
		try { Thread.sleep(10); } catch (Exception e){}
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join(); //to make main thread to wait
		t2.join();
		
		System.out.println(t1.isAlive());

		
		System.out.println("Bye");
	}

}

