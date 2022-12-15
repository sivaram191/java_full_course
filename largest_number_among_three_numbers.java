import java.util.Scanner;

public class largest_number_among_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("a is largest");
			}
			else
			{
				System.out.println("c is largest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is largest");
			}
			else
			{
				System.out.println("c is largest");
			}
		}
		

		

	}

	
}
