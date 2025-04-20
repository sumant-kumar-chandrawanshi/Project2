public class SelectionSortInArray {
    void selectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int smallest_id=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[smallest_id])
                {
                    smallest_id=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest_id];
            arr[smallest_id]=temp;
        }


    }

    void display(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,5,3};
        SelectionSortInArray s=new SelectionSortInArray();
        s.selectionSort(arr);
        s.display(arr);
    }
}
