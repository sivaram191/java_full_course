import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the string");
		String str =s.nextLine().toLowerCase();
		int vowels = 0;
		int consonants = 0;
		int n = str.length();
		for(int i=0;i<n;i++)
		{
		    if(str.charAt(i) != 'a' & str.charAt(i)!='e' & str.charAt(i)!='i' & str.charAt(i)!='o' & str.charAt(i)!='u')
		    {
		        consonants++;
		    }
		}
	    vowels =n-consonants;
	    System.out.printf("no of vowels =%d\n", vowels);
	    System.out.printf("no of consonants =%d\n", consonants);
	}
}
