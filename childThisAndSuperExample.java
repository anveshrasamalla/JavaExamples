package anvesh;

public class childThisAndSuperExample extends ThisAndSuperExample {
	
	
	int a= 5;
	char b = 'b';
	int c= 10;
	
		
	childThisAndSuperExample ()
	{
	
	System.out.println(this.a+super.a);
	System.out.println(this.b+super.b);
	System.out.println(this.c+super.c);


	
	}

}
