import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
      
      Scanner s = new Scanner (System.in);
      System.out.println ("Enter the numbers");
      int a = s.nextInt ();
      for(int i=2;i<=a;i++)
	  {
	      
		  if(a%i==0 && prime(i)==1)
		  {
		      System.out.println(i);
		  }
	  }
	  
  }
  public static int prime(int a)
  {
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
		    return(1);
		}
		else if(flag>0)
		{
		    return(0);
		}
		else
		{
		    return(1);
		}
  }
}
