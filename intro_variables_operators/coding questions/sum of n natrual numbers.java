import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter N");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int ans = n*(n+1)/2;
		System.out.println(ans);
	}
}
