package Task1;
import java.util.Scanner;
public class pattern {
public static void main(String args[])
{
	int i,j,k;
	Scanner obj= new Scanner(System.in);
	int a = obj.nextInt();
	
	for(i=a; i>0;i--)
	{
		for(j=a;j>i;j--)
		{
		System.out.print(j+" ");
		
		}
		
		for(k=1;k<=i;k++)
		{
			System.out.print(i+" ");
			
		}
	System.out.println();
	}
}
}
