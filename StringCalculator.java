package anvesh;

public class StringCalculator {
	
	public static final int add(final String numbers)
	{
		String[] numbersArray = numbers.split(",|n");
		
		if(numbersArray.length > 2)
		{
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } 
		else {
			for (String number : numbersArray) {
				if(!number.isEmpty())
				{
                Integer.parseInt(number);
				}
            }
		}
		
		return 0;
		
	}
	
	
}
