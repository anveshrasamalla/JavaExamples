package anvesh;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int current,prev=1,prevprev=0;
		for (int i=0;i<45;i++)
		{
			current=prev+prevprev;
			System.out.println(current);
			prevprev=prev;
			prev=current;
		}
		// TODO Auto-generated method stub

	}

}
