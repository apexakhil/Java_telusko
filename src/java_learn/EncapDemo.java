package java_learn;

class student
{
	private int rollno;
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class EncapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.setName("Akhilesh");
		obj.setRollno(7);
		obj.setId(786);
		
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());
		System.out.println(obj.getId());
	}

}
