public class Main
{
	public static void main(String[] args) {
		String s = "12asdsa21";
		int flag = 1;
		int n = s.length();
		for(int i=0;i<n/2;i++)
		{
		    if(s.charAt(i) != s.charAt(n-i-1))
		    {
		        flag = 0;
		        break;
		    }
		}
		
		if(flag == 1)
		{
		    System.out.println("it is palindrome");
		}
		else
		{
		    System.out.println("it is not a palindrome");
		}
	}
}
