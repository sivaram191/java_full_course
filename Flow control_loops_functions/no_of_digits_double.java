import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the number");
	    double a = s.nextDouble();
	    String ans = Double.toString(a);
	    int count = (ans.length()-1);
	    System.out.printf("no of digits = %d", count);
	}
}
