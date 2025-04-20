import java.util.Scanner;

public class practiceOne {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nenter the postion and element you want to change ");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        System.out.println("Your result is ");
        arr[a-1]=b;
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}