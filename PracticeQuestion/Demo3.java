import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Test c=new Test();
        //8. Write a java program to display the following pattern.
        int b=7;
        // int a=c.input(b);
        // int n=c.input();
        // c.display(b);
        

        //patter question 
        // c.p_of_rectagel(4,4);
        // c.p_of_triangle(5);
        // c.p_of_triangle_revese(4);
        c.p_of_triangle_left(4);

    }

    
}

class Test{
    int input(int a)
    {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        return a;
    }
    void display(int a)
    {
        System.out.println(a);
    }

    void dis_table(int a,int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
    void p_of_rectagel(int n,int m){
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

   }


    void p_of_triangle(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void p_of_triangle_revese(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void p_of_triangle_left(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }







}


