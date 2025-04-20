class A{//parent class
    int a;
    void set_A(int x)
    {
        a=x;
    }
}

public class Inter_W_S_In extends A {//it is class B or child class
    
    int b,product;
    void set_B(int x){
        b=x;
    }
    void cal_Product()
    {
        product =a*b;
        System.out.println("Product = "+product);

    }
    public static void main(String[] args) {
        Inter_W_S_In b=new Inter_W_S_In();
        b.set_A(5);
        b.set_B(5);
        b.cal_Product();
    }
}
