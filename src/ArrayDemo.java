
class Student
{
	int id=10;
	String name;
}

public class ArrayDemo {

	public static void main(String[] args) {
		//1d array
		int nums[] = new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		
	//	int nums[] = {1,2,3,4,5}; this also works
		
		nums[3]=6; //we can modify the array value
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Student s[] = {s1,s2,s3,s4}; //we can create array of objects
		
		for (int i=0;i<5;i++)
		{
			//System.out.println(nums[i]);
		}
		//System.out.println("Student id: "+s1.id);
		
		//2d array (no. of cols fixed)
		int a[]={1,2,5,7};
		
		//Enhanced for loop
		System.out.println("Enhanced for loop for 1d array: ");
		for(int k:a)
		{
			System.out.print(" "+k);
			
		}
		System.out.println();
		
		int b[]={4,5,6,8};
		int c[]={5,7,9,6};
		
		int d2[][] = {
						{1,2,5,7},{4,5,6,8,7,9},{5,7,9} //jagged array (no. of cols not fixed)
					};
		
//		for(int i=0;i<d2.length;i++)
//		{
//			for(int j=0;j<d2[i].length;j++)
//			{
//				System.out.print(" "+d2[i][j]);
//			}
//			System.out.println();
//		}
		System.out.println("Enhanced for loop for 2d array: ");
		for(int k[]:d2) //k array will fetch one one array from d2
		{
			for(int l:k) //l will fetch one one element from k
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}
