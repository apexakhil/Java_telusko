package java_learn;

public class IterationDemo {

	public static void main(String[] args) {
		
		//while loop
	/*	int i=1;  //initialization
		while(i<=5)  //condition
		{
			System.out.println("Hello");
			i++; //increment or decrement	
		}
		*/
		
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for(int a=0;a<=4;a++)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print((char)('A'+b) + " ");
			}
			System.out.println();
		}
		
		for(int a=0;a<=4;a++)
		{
			for(int b=4;b>=a;b--)
			{
				System.out.print((char)('A'+a) + " ");
			}
			System.out.println();
		}
		
		for(int a=0;a<=4;a++)
		{
			for(int b=0;b<=4-a;b++)
			{
				System.out.print((char)('A'+b) + " ");
			}
			System.out.println();
		}
		
		for(int a=0;a<=3;a++)
		{
			for(int b=0;b<=3;b++)
			{
				if(a>=1 && b>=1 && a<=2 && b<=2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("$");
				}
			}
			System.out.println();
		}

	}

}
