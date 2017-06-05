package anvesh;

public class Assignment_App {	
		
		public static String middleThree(String str) {
			

			String result = str;
			

			
			if(str.length() < 3)
			{
				return str;
			}
			if(str.length()/2==0)
			{
				System.out.println("Please enter odd length of string");
			}
		else
			{
				int mid = str.length()/2;
				result = str.substring(mid-1, mid+2);
				System.out.println(result);
				
			}	
			
			return result;	
		}
		
		
		
		public static void main(String args[]){
			
			
			Assignment_App.middleThree("anves");


}
}
		