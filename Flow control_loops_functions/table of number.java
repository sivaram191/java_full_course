import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the number");
	    int a = s.nextInt();
	    int ans;
	    for(int i=1;i<=10;i++)
	    {
	        ans = a*i;
	        System.out.println(a+"x"+i+"="+ans);
	    }
	}
}
