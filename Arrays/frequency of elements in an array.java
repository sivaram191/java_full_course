import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array = {1,34,244,1,34,45,23,44,45,4554,45};
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check it's freqeuncy:");
		int a = s.nextInt();
		int flag = 0;
		for(int i=0;i<array.length;i++)
		{
		    if(array[i]==a)
		    {
		        flag++;
		    }
		}
		System.out.printf("freqeuncy of the number is: %d",flag);
	}
}
