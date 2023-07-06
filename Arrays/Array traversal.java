import java.util.*;
public class Main {
    public static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            array[i]= s.nextInt();
        }
        printarray(array);
    }
}
