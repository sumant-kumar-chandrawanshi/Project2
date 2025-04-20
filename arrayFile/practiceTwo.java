import java.util.Scanner;
public class practiceTwo {
    
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =n.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter "+size+ " element in array ");

        for(int i=0;i<size;i++)
        {
            arr[i]=n.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+ "  ");
        }

        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++ )
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=0;
                }
            }
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
}
