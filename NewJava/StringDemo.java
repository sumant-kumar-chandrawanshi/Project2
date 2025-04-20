class StringDemo {
    public static void main(String[] args)
    {
        String s="Ravikant";
        System.out.println(s.indexOf('c')); // 3
        System.out.println(s.indexOf('z')); // -1
    }
}

//class StringDemo {
//    public static void main(String[] args){
//    String s="ravikantkumar";
//    System.out.println(s.lastIndexOf('a'));//1
//    System.out.println(s.indexOf('z'));//-1
//    }
//}


//class StringDemo {
//    public static void main(String[] args) {
//        String s1="Ravi";
//        String s2=s1.toUpperCase();
//        String s3=s1.toLowerCase();
//        System.out.println(s1==s2);//false
//        System.out.println(s1==s3);//false
//    }
//}

//class StringDemo {
//    public static void main(String[] args) {
//        String s1="Ravi";
//        String s3=s1.toString();
//        System.out.println(s1==s3);//true
//    }
//}

//class StringDemo {
//    public static void main(String[] args) {
//        String s1=new String("Ravi");
//        String s2=s1.toString();
//        String s3=s1.toUpperCase();
//        String s4=s1.toLowerCase();
//        String s5=s1.toUpperCase();
//        String s6=s3.toLowerCase();
//        System.out.println(s1==s6); //false
//        System.out.println(s3==s5); //false
//    }
//}