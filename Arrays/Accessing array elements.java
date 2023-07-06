import java.util.*;
public class Main {
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
        System.out.println("Enter which position to access");
        int a = s.nextInt();
        System.out.printf("element at %d position is = ",a);
        System.out.println(array[a-1]);
    }
}
