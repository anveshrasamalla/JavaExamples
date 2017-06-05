package anvesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Anvesh
public class Areas {
	
	void findArea(int a)
	{
		
		System.out.println("Area of Square is :" + a*a);
		
	}
	
	void findArea(int a,int b)
	{
		System.out.println("Area of Rectangle is :" + a*b);
		
	}
	
	void findArea(int a,int b,int c)
	
	{
		int temp = (a+b+c);
		double s = temp/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is :" + area);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Areas a =new Areas();
		 BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("\n Choose the Shape to find Area \n 1.Square \n 2.Rectangle \n 3.Triangle");
		 
		 try {
			int choice = Integer.parseInt(Br.readLine());
			if (choice != 1 || choice != 2 || choice != 3)
			{
				//System.out.println("Please enter valid input");
			}
			
		 
			
		 switch(choice)
		 {
		 case 1:
			 System.out.print("Enter the length of the Side: ");
			 int side;
			
				side = Integer.parseInt(Br.readLine());
			
			 a.findArea(side);
			 break;
		 case 2:
			 System.out.print("\n Enter the length: ");
			 int length = Integer.parseInt(Br.readLine());

			 System.out.print("\n Enter the Breadth: ");
			 int breadth = Integer.parseInt(Br.readLine());
			 a.findArea(length,breadth);
			 break;
		 case 3:
			 System.out.print("\n Enter the length: ");
			 int len = Integer.parseInt(Br.readLine());

			 System.out.print("\n Enter the Breadth: ");
			 int br = Integer.parseInt(Br.readLine());
			 
			 System.out.print("\n Enter the Breadth: ");
			 int height = Integer.parseInt(Br.readLine());
			 
			 a.findArea(len,br,height);
			 break;
			}
		 }
			catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			 
			 
		 }
			
	 
		 
		 	}




