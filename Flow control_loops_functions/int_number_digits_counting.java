import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the number");
	    int a = s.nextInt();
	    int count=0;
	    while(a!=0)
	    {
	        a=a/10;
	        count++;
	    }
	    System.out.printf("no of digits = %d", count);
	}
}
