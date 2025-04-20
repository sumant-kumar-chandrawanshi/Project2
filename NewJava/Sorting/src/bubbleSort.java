public class bubbleSort {
    void bubble(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    void display(int arr[],int n){
        for(int i=1;i<=n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
    bubbleSort n=new bubbleSort();
    int arr[]={5,3,8,4,2,6,1};
    int a=7;
    n.bubble(arr,a);
    n.display(arr,a);
    }
}
