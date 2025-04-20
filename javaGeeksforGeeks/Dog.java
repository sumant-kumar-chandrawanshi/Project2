class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}
public class Dog extends Animal{
    public static void main(String[] args) {
        
    Dog d=new Dog();
    d.eat();
    }
}
