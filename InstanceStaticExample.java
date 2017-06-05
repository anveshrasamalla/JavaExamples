package anvesh;

public class InstanceStaticExample {

	int a = 100;//Instance Variable
	static int b = 500;//Static Variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st Object Creation
		InstanceStaticExample i =new InstanceStaticExample();
		//Calling instance and static variables
		System.out.println(i.a);
		System.out.println(i.b);
		//Updating instance and static variables with other numbers
		i.a=200;
		i.b=1000;
		//Variables are updated
		System.out.println(i.a);
		System.out.println(i.b);
//2nd  Object Creation
		InstanceStaticExample j =new InstanceStaticExample();
		/* Instance variable is updated for every object creatrion that for every new object new memory is being 
		in case of instance variables while for static variables for any number of variables memory is same */
		System.out.println(j.a);
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(j.b);




	}

}
