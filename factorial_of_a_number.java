import java.util.Scanner;
import java.math.*;

public class factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		double fac=1;
		for (int i=1;i<=a;i++)
		{
			fac=fac*i;
		}
        System.out.println(fac);
		

	}
}
