package java_learn;

public class VariableDemo {

	public static void main(String[] args) {
		
		byte b=12; //1 byte
		short s=12; //2 bytes
		int i=1234; //4 bytes
		long l=123456781231234l; //8 bytes (l at last)
		
		float f=1.7f; //4 bytes; (f at last)
		double d=1.7; //8 bytes;
		
		char c='A';
		c=66; //since 66 is the ASCII value of B it will print B
		
		System.out.println(c);
		
		double d2=77; //double will store int val implicit typecasting or conversion
		int i2= (int)23.4; //typcasting from float to int explicit typecasting
		System.out.println(i2);

}
}