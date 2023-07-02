import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter no of rows");
	    int rows = s.nextInt();
	    
	    for(int i=1;i<=rows;i++)
	    {
	        for(int j=1;j<=rows;j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
