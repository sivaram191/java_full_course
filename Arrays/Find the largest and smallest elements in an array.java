import java.util.*;

public class Main {
    
    public static void smallest(int[] arr) {
        int min = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
    public static void largest(int[] arr) {
        int max = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 9, 1, 7};
        largest(arr);
        smallest(arr);
    }    
}
