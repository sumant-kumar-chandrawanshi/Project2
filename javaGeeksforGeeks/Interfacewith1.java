
interface intefA
{
    void m1();
}

interface intefB
{
    void m2();
}

class sample implements intefA, intefB {
    @Override public void m1()
    {
        System.out.println("Welcome: inside the method m1");
    }
    @Override public void m2()
    {
        System.out.println("Welcome: inside the method m2");
    }
}


public class Interfacewith1
{
    public static void main(String[] args) {
        sample ob1 =new sample();
        ob1.m1();
        ob1.m2();
    }
}
