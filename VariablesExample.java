package anvesh;

public class VariablesExample {
	//instance variables
	int a =10;
	int b =20;
	static int x=100000;
	static int y=300000;
	byte c;
	int d;
	short e;
	long f;
	
	//static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//static area		
		
		VariablesExample v = new VariablesExample();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println(v.e);

		
		
		//Static Variables can be accessed by 3 types if it in same package
		System.out.println(x);//Direct Access
		System.out.println(VariablesExample.y);//By using class Name
		System.out.println(v.y);//By using object 
		v.m1();	
		

	}
	//instance method
	void m1()
	{
		//instance area
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(y);
		System.out.print(x);
	}

}
