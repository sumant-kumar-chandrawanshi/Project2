public class rectifyCode {
    public static void main(String[] args) {
        // int []y=int[11];
        // int x[]=int[10];

        // x=y=new int[20];
        // x={1,2,3};
        int c=~4;
        System.out.println(c);
        String s="ravikant";
        System.out.println(s instanceof String);
        int i=10;
        // System.out.println(i instanceof String);
        // System.out.println(i instanceof Object);
        String b="Ravi";
        String s1="Ravi";
        String s2=new String("Ravi");
        if(s1==b)
        {
            System.out.println("s1 si equal to b");
        }
        else
        {
            System.out.println("s1 is equal to b");
        }
        if(s1==s2)
        {
            System.out.println("s1 is equal to s2");
        }
        else
        {
            System.out.println("s1 is not equal to s2");
        }
    }
    
}
