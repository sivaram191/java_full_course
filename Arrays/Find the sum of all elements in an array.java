import java.util.*;

public class Main {
    
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 9, 1, 7};
        sum(arr);
    }    
}
