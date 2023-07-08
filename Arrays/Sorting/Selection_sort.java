public class Main
{
    
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
		int[] array = {3,62,2,1,0,-244,35};
		selectionsort(array);
		System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
}
