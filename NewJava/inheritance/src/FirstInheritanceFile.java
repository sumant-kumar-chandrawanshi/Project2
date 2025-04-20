public class FirstInheritanceFile {
    public static void main(String[] args) {
        System.out.println("Now i am use inherance concept(it's OOP concept");
        Parent n=new Parent();
        int b=n.sum(4,5);
        System.out.println(b);
    }
}
class Parent
{
    int a,b;
    int sum(int a,int b)
    {
        return a+b;
    }
}