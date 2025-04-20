import java.util.Scanner;

public class ThridPatternQ {
    //Reverse the digits of a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        int lastdigits=0;
        while(n>0)
        {

            lastdigits=n%10;
            System.out.print(lastdigits);
            n=n/10;
        }

    }
}
