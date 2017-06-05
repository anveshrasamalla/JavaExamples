package anvesh;

public class JunitExample {
	private String message;

	   //Constructor
	   //@param message to be printed
	   public JunitExample(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;

}
}
