import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter no of rows");
	    int rows = s.nextInt();
	    int ans;
	    for(int i=1;i<=rows;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
	}
}