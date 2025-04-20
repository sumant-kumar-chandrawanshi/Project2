import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       Demo6 c=new Demo6();
       c.hi();
       int j=in.nextInt();
       int a=c.num(j);
       c.Display(a);
    }

    void hi(){
        System.out.println("hi");
    }
    int num(int a)
    {
        if(a==1)
        return 1;
        else
        return a+num(a-1);
    }
    void Display(int a)
    {
        System.out.println(a);
    }

}
