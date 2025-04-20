public class BubbleSort {
    void bubbleSortIn(int arr[])
    {   int temp,i,j;
        int n = arr.length;
        boolean swapped;
        for(i=0;i<n-1;i++)
        {
            
            swapped=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    
                }
            }
            if(swapped ==false)
                display(arr);
        }
    }

    void display(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        int arr[]={8,5,4,6,3,2};
        BubbleSort b=new BubbleSort();

        b.bubbleSortIn(arr);

        System.out.println("Sorting Result is....");

        b.display(arr);

    }

    
}
