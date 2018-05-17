package anvesh;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//Added a Comment to test GIT commmit
		//Pushing changes
		
		for(int i=0;i<100;i++)
		{
			if((i%5)==0 && (i%7)==0)
			
				System.out.println("FizzBuzz");
			
			else if((i%5)==0)
			
				System.out.println("Fizz");
				
			
			
			else if((i%7)==0)
			
				System.out.println("Buzz");
			
			
			else
				System.out.println(i);
			
			System.out.println(" ");
		}
		// TODO Auto-generated method stub

	}

}
