class A{
    int a;
    void set_A(int x)
    {
        a=x;
    }
}
//Child of Class A
class B extends A{
    int b;
    void set_B(int x)
    {
        b=x;
    }
}

//child of class B but access to methods of both class

public class Inter_W_Mp_In extends B {
    int c,product;
    void cal_Product()
    {
        product = a*b;
        System.out.println("Product = "+product);
    }


    public static void main(String[] args) {
        Inter_W_Mp_In c=new Inter_W_Mp_In();
        //class c access methods of both class A and B
        c.set_A(5);
        c.set_B(5);
        c.cal_Product( );
    }
}