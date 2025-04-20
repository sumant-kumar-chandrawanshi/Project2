public class functionUse {
    int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("This is function and you use it");
        functionUse n=new functionUse();
        int b=n.sum(4,6);
        System.out.println(b);
    }
}
