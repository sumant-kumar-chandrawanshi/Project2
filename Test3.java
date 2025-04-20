public class Test3 {
    public static void main(String[] args) {
        object o=class.forName(args[0].newInstance());
        System.out.println(o.getClass());
    }
    
}
