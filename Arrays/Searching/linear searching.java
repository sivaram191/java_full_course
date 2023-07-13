import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array= {1,3,5,68,35,35,35};
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to search");
		int a = s.nextInt();
		int flag=0;
		for(int i =0;i<array.length;i++)
		{
		    if(array[i]==a)
		    {
		        flag++;
		    }
		}
		if(flag>0)
		    {
		        System.out.printf("it is found at %d times",flag);
		    }
		else{
		    
		     System.out.printf("it is not found");
		    }
	}
}
