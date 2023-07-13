import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] array = {1,2,3,2342,21};
		int temp;
		for(int i=0;i<array.length/2;i++)
		{
		    temp = array[i];
		    array[i] = array[array.length-1-i];
		    array[array.length-1-i] = temp;
		}
		
		for(int j=0;j<array.length;j++)
		{
		    System.out.println(array[j]);
		}
	}
}
