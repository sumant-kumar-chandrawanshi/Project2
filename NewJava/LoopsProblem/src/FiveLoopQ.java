import java.util.Scanner;

public class FiveLoopQ {
    //1. Print the first n factorial numbers
    //2. Given 2 numbers a and b. Find a raise to the power b.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial+=i;
            System.out.println("Factorial ="+factorial);
        }
    }
}
