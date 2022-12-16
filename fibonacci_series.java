import java.util.Scanner;
import java.math.*;

public class fibonacci{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int f=0;
		for(int s1=1;s1<=a;)
		{
			int temp=s1;
			s1=s1+f;
			f=temp;
			
			System.out.print(f);
			System.out.print(" ");
		}

	}
}
