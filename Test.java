package anvesh;

public class Test {
	
	
	
int a=20;
int b=10;
int c;
int e;
int d;
		

int add(int a,int b)
{
	c=(a+b);
	return(c);
}

int add(int a,int b,int d)
{
	e=(a+b)-d;
	return(e);
}

int multiply()
{
	return(a*b);
}

int divide()
{
	return(a/b);
	
}

	public static void main(String[] args)
	{
		
		Test t=new Test();
	
		t.add(6,5,4);
		System.out.println(t.add(2,3));
		System.out.println(t.add(2,3));
		System.out.println(t.multiply());
		System.out.println(t.divide());
		
		}
			
		
					// TODO Auto-generated method stub

	}


