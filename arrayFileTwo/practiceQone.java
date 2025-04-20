
//the cumutative sum of an array at index is defined as the sum of all elements of the array from index 0 to index i.
public class practiceQone {
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int sum=0;

        for(int i=0;i<4;i++)
        {
            System.out.print(arr[i]+"  ");
        }

        System.out.println();
        for(int i=0;i<4;i++)
        {
            sum=sum+arr[i];
            System.out.print(sum+"  ");
        }

    }
}