import java.util.Scanner;
import java.math.*;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int flag=1;
		for (int i=2;i<=(a/2);i++)
		{
			double x=a%i;
			if(x==0)
			{
				flag=0;
			}
		}
		if(flag==0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
		

	}
}
