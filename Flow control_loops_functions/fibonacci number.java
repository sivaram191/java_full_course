import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter no of terms in fibonacci");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int c;
		int count =0;
		while(count<n)
		{
		    System.out.print(a+",");
		    c = a+b;
		    a=b;
		    b=c;
		    count++;
		    
		}
		
	}
}
