//
//
//public class Test
//{
//    public void methodOne() {
//        class Inner {
//            public void sum(int i,int j) {
//                System.out.println("The sum:"+(i+j));
//            }
//        }
//        Inner i=new Inner();
//        i.sum(10,20);
//        i.sum(100,200);
//        i.sum(1000,2000);
//    }
//    public static void main(String[] args)
//    {
//        new Test().methodOne();
//    }
//}

//
//
//
//public class Test
//{
//    int x=10;
//    static int y=20;
//    public void methodOne() {
//        class Inner {
//            public void sum(int i,int j) {
//                System.out.println("The sum:"+(i+j));
//                System.out.println("The sum:"+(x+y));
//            }
//        }
//        Inner i=new Inner();
//        i.sum(10,20);
//        i.sum(100,200);
//        i.sum(1000,2000);
//    }
//    public static void main(String[] args)
//    {
//        new Test().methodOne();
//    }
//}



//
//public class Test
//{
//    int x=10;
//    static int y=20;
//    static public void methodOne() {
//        class Inner {
//            public void sum(int i,int j) {
//                System.out.println("The sum:"+(i+j));
//                //System.out.println("The sum:"+(x+y)); //x is not able to access
//            }
//        }
//        Inner i=new Inner();
//        i.sum(10,20);
//        i.sum(100,200);
//        i.sum(1000,2000);
//    }
//    public static void main(String[] args)
//    {
//        new Test().methodOne();
//    }
//}
//

//
//class Test
//{
//    int x=10;
//    public void methodOne() {
//        int y=20;
//        class Inner {
//            public void methodTwo() {
//                System.out.println(x);//10
//                System.out.println(y); //C.E: local variable y is accessed from within inner
//                //class needs to be declared final.
//            }
//        }
//        Inner i=new Inner();
//        i.methodTwo();
//    }
//    public static void main(String[] args) {
//        new Test().methodOne();
//    }
//}

//
//class Test {
//    int i = 10;
//    static int j = 20;
//
//    public void methodOne() {
//        int k = 30;
//        final int l = 40;
//        class Inner {
//            public void methodTwo() {
//                System.out.println(i);
//                System.out.println(j); //-->line 1
//                System.out.println(k);
//                System.out.println(l);
//            }
//        }
//        Inner i=new Inner();
//        i.methodTwo();
//
//
//    }
//
//    public static void main(String[] args) {
//        new Test().methodOne();
//    }
//}



//
//class Test {
//    int i = 10;
//    static int j = 20;
//
//    static public void methodOne() {
//        int k = 30;
//        final int l = 40;
//        class Inner {
//            public void methodTwo() {
//                //System.out.println(i);
//                System.out.println(j); //-->line 1
//               //System.out.println(k);
//                System.out.println(l);
//            }
//        }
//        Inner i=new Inner();
//        i.methodTwo();
//
//
//    }
//
//    public static void main(String[] args) {
//        new Test().methodOne();
//    }
//}

//
//import java.lang.reflect.*;
//class Test {
//    public static void main (String[] args){
//        int count = 0;
//        Object o = new String("Ravikant");
//        Class c  = o.getClass();
//        System.out.println("fully quaalified name:"+c.getName());
//        Method[] m = c.getDeclaredMethods();
//        System.out.println("method info");
//        for(Method m1 : m){
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println("the number of methods:"+count);
//    }
//}



//class Test {
//    public static void main (String[] args){
//        String s1=new String("Ravi");
//        s1.concat("Kant");
//        System.out.println(s1);
//    }
//}




//class Test {
//    public static void main (String[] args) {
//
//        String s1 = new String("Ravi");
//        String s2 = s1.concat("Kant");
//
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//    }


//class Test {
//    public static void main (String[] args){
//        StringBuffer s1=new StringBuffer("Ravi");
//        s1.append("Kant");
//        System.out.println(s1);
//    }
//}



//class Test {
//    public static void main (String[] args){
//        String s1=new String("Ravi");
//        String s2=new String("Ravi");
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//    }
//}

//class Test {
//    public static void main (String[] args){
//        StringBuffer s1=new StringBuffer("Ravi");
//        String s3="Ravi";
//        StringBuffer s2=new StringBuffer("Ravi");
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//    }
//}

//
//class Test {    //StringDemo
//    public static void main(String[] args) {
//        char[] ch={'a','b','c'} ;
//        String s=new String(ch);
//        System.out.println(ch);//abc
//    }
//}


//class Test {    //StringDemo
//    public static void main(String[] args) {
//        byte[] b={100,101,102,103,97};
//        String s=new String(b);
//        System.out.println(s); //def
//    }
//}

//
//class Test {    //StringDemo
//    public static void main(String[] args){
//    String s="Ravi";
//    System.out.println(s.charAt(3));//i
//    //System.out.println(s.charAt(100));// RE : StringIndexOutOfBoundsException
//}
// }

//class Test {    //StringDemo
//    public static void main(String[] args) {
//        String s="Ravi";
//        //s=s.concat("software");
//        //s=s+"software";
//        s+="software";
//        System.out.println(s);//Ravisoftware
//    }
//}

//class Test {
//    public static void main(String[] args) {
//        String s ="JAVA";
//        System.out.println(s.equals("java"));//false
//    }
//}

//
//class Test {    //StringDemo
//    public static void main(String[] args) {
//        String s = "java";
//        {
//            System.out.println(s.equals("JAVA"));//false
//            System.out.println(s.equalsIgnoreCase("JAVA"));//true
//        }
//    }
//}


//class Test {
//    public static void main(String[] args) {
//        String s="Ravikantsoft";
//        System.out.println(s.substring(8));//soft
//    }
//}






class Test {
    public static void main(String[] args) {
        String s1=new String("ravi");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
    }
}
