import java.util.Scanner;

public class SecondLoopQ {
    //Find the sum of digits in a given number n.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int sum=0;
        int lastdigit=0;
        while(n>0)
        {
            lastdigit+=n%10;
            sum+=lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
