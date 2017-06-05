package anvesh;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	String message = "Hello World";	
	   JunitExample messageUtil = new JunitExample(message);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,messageUtil.printMessage());
	
}
}
