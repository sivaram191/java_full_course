import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int ans = 1;
		for(int i=1;i<=num;i++)
		{
		    ans = ans*i;
		}
		System.out.println(ans);
	}
}
