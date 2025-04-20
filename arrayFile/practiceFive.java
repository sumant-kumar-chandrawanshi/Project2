import java.util.Scanner;

public class practiceFive {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        char arr[]={'s','u','s'};
        int size=arr.length;
        System.out.println(size);

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }


        // for(int i=0;i<size/2;i++)
        // {
        //     for(int j=size-1;j>=0;j--)
        //     {    
        //         if(arr[i]==arr[j])
        //         {
        //             System.out.println("yes it is Palindrome");
        //         }
        //         else{
        //             System.out.println("not palindrome");
        //         }
        //     }
        // }

    }
    
}
