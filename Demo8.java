public class Demo8 {
    public static void main(String[] args) {
        
        try
        {
            int data =25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is alway executed");
        }
        System.out.println("rest of code..");
    }
}


// public class Demo8 {
//     public static void main(String[] args) {
//         int a;
        
//     }
// }
