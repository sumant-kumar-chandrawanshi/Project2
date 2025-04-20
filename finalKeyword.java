// public class finalKeyword {
//     final int a=10;
   
//     public static void main(String[] args) {
//         finalKeyword d=new finalKeyword();
//         System.out.println(d.a);
//         //d.a=20;
//     }
// }


public class finalKeyword {
    final int a=10;
   final public void method()
   {
    System.out.println("form finalKeyword method");
   }
}
class child extends finalKeyword{
    // public void method(){
    //     System.out.println("child method");
    // }
   }
    public static void main(String[] args) {
        child d=new child();
        System.out.println(d.a);
        //d.a=20;
    }






