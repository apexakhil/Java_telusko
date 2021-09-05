package java_learn;

public class SelectionDemo {

	public static void main(String[] args) {
		int i=3, j=6;
		String a="abc";
		//j = i>5 ? 1:2; //ternary operator(condition ? exp1:exp2) if i>5 then j=1 else j=2
		//System.out.println(j);
		
		//switch
		
		switch(i)
		{
		case 1: 
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("No match");
		}

	}

}
