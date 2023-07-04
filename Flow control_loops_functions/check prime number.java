import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = s.nextInt();
		int flag = 0;
		
		for(int i=2;i<=Math.sqrt(a);i++)
		{
		    if(a%i==0)
		    {
		        flag++;
		    }
		}
		if(a==2)
		{
		    System.out.println("prime number");
		}
		else if(flag>0)
		{
		    System.out.println("not a prime number");
		}
		else
		{
		    System.out.println("prime number");
		}
	}
}
