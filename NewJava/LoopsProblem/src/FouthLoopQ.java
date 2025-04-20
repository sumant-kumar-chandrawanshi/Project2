import java.util.Scanner;

public class FouthLoopQ {
    //Find the sum of the following series
    //S=1-2+3-4...n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum=sum-i;
            }
            else {
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
