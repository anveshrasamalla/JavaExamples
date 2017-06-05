package anvesh;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Anvesh";
		
		int b=a.length();//finds the length of the string
		String c = a.substring(2);// substrings the string after 2 indexes that is 0,1 that is prints 'vesh'
		String d = a.substring(0,2);//substrings the string mentioned that is prints 'An' excluding 2
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if(a.length() > 5)
		{
			System.out.println("Okay");

		}
		
		else
		{
			System.out.println("Not Okay");
		}


	}

}
