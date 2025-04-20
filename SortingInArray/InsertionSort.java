public class InsertionSort {
    void insertionS(int arr[])
    {
        int n=arr.length;

        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int pres=i-1;
            while(pres>=0 && arr[pres]>arr[curr])
            {
                arr[pres+1]=arr[pres];
                pres--;
            }
            arr[pres+1]=arr[curr];
        }
        }

        void display(int arr[])
        {
            int n=arr.length;

            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]+"  ");
            }
        }


    public static void main(String[] args) {
        
        int arr[]={4,1,5,2,3};
        InsertionSort i=new InsertionSort();
        i.insertionS(arr);
        i.display(arr);
        System.out.println(arr.length);
    }
    
}
