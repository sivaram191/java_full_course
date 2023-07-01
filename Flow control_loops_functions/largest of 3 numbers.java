import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the 3 numbers");
	    int a = s.nextInt();
	    int b = s.nextInt();
	    int c = s.nextInt();
	    int largest;
	    if(a>b && a>c)
	    {
	        largest = a;
	    }
	    else if (b>a && b>c)
	    {
	        largest = b;
	    }
	    else
	    {
	        largest = c;
	    }
	    System.out.printf("larget number is:%d", largest);
		
	}
}
