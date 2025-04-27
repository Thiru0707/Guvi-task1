package Task1;
import java.util.Scanner;
public class discount {

	public static void main(String args[])
	{
		 Scanner obj = new Scanner (System.in);
		 int a= obj. nextInt();
		 double d=0,f;
		 
		if(a>1000)
		{
			d = a*20/100;
			
		}
		else if(a >= 500 && a <= 1000)
		{
		 d = a*10/100;
			
		}

         	f= a-d;
	
		System.out.println("Final Payble=" + f);
	}
}
