import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int lcm = (a*b)/gcd(a,b);
		System.out.println(lcm);
	}
	public static int gcd(int a,int b)
	{
	    int temp;
		if (b>a)
		{
		    temp = a;
		    a = b;
		    b = temp;
		}
		int rem =1;
	    while(rem!=0)
	    {
	        rem=a%b;
	        a=b;
	        b=rem;
	    }
	    return a;
	}
}
