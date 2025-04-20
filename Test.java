public class Test {
    public static void main(String[] args) throws Exception {
        Test t=new Test();
        System.out.println(Class.forName(args[0]).isInstance(t));
    }
}

