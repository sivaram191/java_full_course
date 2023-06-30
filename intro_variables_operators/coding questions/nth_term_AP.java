import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the first number of Arithmetic progression:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("enter the common differnce of Arithmetic progression:");
	    float r = s.nextFloat();
		System.out.println("enter n:");
		int n=s.nextInt();
		float ans = a+(n-1)*r;
		System.out.println(ans);
	}
}
