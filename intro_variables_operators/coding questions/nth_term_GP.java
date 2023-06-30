import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the first number of GP:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("enter the r of GP:");
	    float r = s.nextFloat();
		System.out.println("enter n:");
		int n=s.nextInt();
		float ans = a*(float)Math.pow(r,n-1);
		System.out.println(ans);
	}
}

