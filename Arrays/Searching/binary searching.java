import java.util.*;
public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        selectionSort(arr);
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number to search");
        int a = s.nextInt();
        int flag=0;
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid] == a)
            {
                flag++;
                break;
            }
            else if(arr[mid]<a)
            {
                left = mid+1;
            }
            else
            {
                right = mid -1;
            }
        }
        if (flag>0) {
            System.out.printf("Target element found");
        } 
        else {
            System.out.println("Target element not found in the list");
        }
    }
}
