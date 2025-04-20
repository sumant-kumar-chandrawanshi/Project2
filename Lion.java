abstract class Animal{
    abstract void sound();
    void eat(String s)
    {
        System.out.println("I eat "+s);
    }
}

class Lion2 extends Animal
{

    public static void main(String[] args) {
        Lion L=new Lion();
        L.sound();
        L.eat("flash");
    }
    void sound()
    {
        System.out.println("Roar");
    }
}