interface ABC
{
	void show();
}
public class IntAnony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj = new ABC()
				{
					public void show()
					{
						System.out.println("Interface obj can be created using Anonymous class");
					}
				};
		obj.show();
		
	}

}
