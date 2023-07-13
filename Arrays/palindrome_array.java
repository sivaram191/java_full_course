import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array = {1,2,3,2,21};
		int pla = 0;
		for(int i=0;i<array.length/2;i++)
		{
		    if(array[i] != array[array.length-1-i])
		    {
		        pla = 1;
		        break;
		    }
		    else
		    {
		        pla = 0;
		    }
		}
		if(pla == 1)
		{
		    System.out.println(" not a palindrome");
		}
		else
		{
		    System.out.println("palindrome");
		}
	}
}
