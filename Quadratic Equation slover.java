import java.util.Scanner;
import java.math.*;

public class quadratic_equ_slover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter coefficients of quadratic equation");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int b2=b*b;
		
		if((b2-(4*a*c))>=0)
		{
			double s2=Math.sqrt(b2-(4*a*c));
			double root1=(-b+(s2))/(2*a);
			double root2=(-b-(s2))/(2*a);
			System.out.println("roots are =");
			System.out.println(root1);
			System.out.println(root2);
		}
		else
		{
			System.out.println("complex roots=");
			double s3=Math.sqrt((Math.abs(b2-(4*a*c))));
			double a1=-b/(2*a);
			double a2=s3/(2*a);
			System.out.print(a1);
			System.out.print("+j");
			System.out.println(a2);
			System.out.print(a1);
			System.out.print("-j");
			System.out.print(a2);
		}
		
		

		

	}
}
