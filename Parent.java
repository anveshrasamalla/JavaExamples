package anvesh;

public class Parent {

	void add()
	{
		System.out.println("Add method parent class");
	}
	
	
	
	
}

class Child extends Parent
{
	void add()
	{
		System.out.println("Add method child class");
		
	}
	
	public static void main(String args [])
	{
		Parent p = new Parent();
		p.add();
			}
	
	
				
}
