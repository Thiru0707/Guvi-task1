package Task1;
import java.util.Scanner;
public class smallest {
	public static void main(String args[])
	{
	Scanner obj = new Scanner(System.in);
	int a = obj.nextInt();
	int b= obj.nextInt();
	int c= obj.nextInt();
	int d;
	
	if (a <= b && a <= c) {
	    d = a;
	} else if (b <= c && b <= a) {
	    d = b;
	} else {
	   d = c;
	}
	System.out.println(d);
	}

}

