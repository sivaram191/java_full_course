import java.util.*;

public class Main {
    
    public static void selectionsort(int[] a)
    {
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            int minindex = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minindex])
                {
                    minindex=j;
                }
            }
            int temp = a[minindex];
            a[minindex] = a[i];
            a[i] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 9, 1,-7,-90,34};
        selectionsort(arr);
        int sec_max = arr[arr.length-2];
        System.out.printf("the 2nd max number is %d",sec_max);
    }    
}
