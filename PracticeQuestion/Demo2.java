import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Test a=new Test();
        a.hi();
        a.name();
        int b;
        int d;
        System.out.println("Enter two value for sum ");
        b=a.input();
        d=a.input();
        int c= a.sum(b,d);
        a.display(c);



        System.out.println("Enter the value of subtraction ");
        b=a.input();
        d=a.input();
        c=a.subtration(b,d);
        a.display(c);


        System.out.println("Enter the value of product ");
        b=a.input();
        d=a.input();
        c = a.product(b,d);
        a.display(c);



        System.out.println("Enter the value of two for divide ");
        b=a.input();
        d=a.input();
        c = a.divide(b,d);
        a.display(c);

        

    }
}

class Test{
    void hi(){
        System.out.println("hi");
    }
    void name(){
        System.out.println("Sumant kuamr");
    }
    int sum(int a,int b){
        
        return a+b;
    }
    int subtration(int a,int b)
    {
        return a-b;
    }
    int product(int a,int b)
    {
        return a*b;
    }
    int divide(int a,int b){
        return a/b;
    }
    int input()
    {
        int a;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        
        return a;
    }
    void display(int a)
    {
        System.out.println(a);
    }


}
