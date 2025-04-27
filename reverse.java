package Task1;
import java.util.Scanner; 
public class reverse {
	public static void main(String args[])
	{
		
		 System.out.println("Enter Number ");
		Scanner obj = new Scanner(System.in);
		
	     int a = obj.nextInt();
	
	    int c = 0;
	     
	     System.out.println("Original Number: " + a);
	     while(a != 0) {
	     
	       int b = a % 10;
	       c = c * 10 + b;

	      a /= 10;
	     }

	     System.out.println("Reversed Number: " + c);
	   }
	}
	
	

