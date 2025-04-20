import java.util.Scanner;

public class FirstLoopQ {
//    Count the number of digits
//    for a given number n.
public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    System.out.println("Enter any number");
    int b=n.nextInt();
    int digits=0;
    while(b>0)
    {
        digits++;
        b=b/10;


    }
    System.out.println(digits);

}

}
