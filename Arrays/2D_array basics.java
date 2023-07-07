import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] array2d = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the elements of 2D array");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        array2d[i][j]=s.nextInt();
		    }
		}
		System.out.println(array2d[0][0]);
		int rows = array2d.length;
		int col = array2d[0].length;
		System.out.printf("no of rows = %d \n",rows);
		System.out.printf("no of col = %d \n",col);
	}
}
