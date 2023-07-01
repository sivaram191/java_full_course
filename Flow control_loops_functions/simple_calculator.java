import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the 2 numbers ");
	    double a = s.nextDouble();
	    double b = s.nextDouble();
	    System.out.println("Select an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Remainder (%)");
	    int operation = s.nextInt();
	    double ans;
	    switch(operation)
	    {
	        case 1:
	            ans=a+b;
	            break;
	       case 2:
	           ans=a-b;
	           break;
	       case 3:
	            ans=a*b;
	            break;
	       case 4:
	           ans=a/b;
	           break;
	       case 5:
	            ans=a%b;
	            break;
	       default:
	            System.out.println("Invalid choice!");
                return;
	    }
	    System.out.print("ans = "+ans);
		
	}
}
