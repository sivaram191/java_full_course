import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the year");
	    int year = s.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.printf("leap year");
        }
        else
        {
            System.out.printf("not a leap year");
        }
		
	}
}
