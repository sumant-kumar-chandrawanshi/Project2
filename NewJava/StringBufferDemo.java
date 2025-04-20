//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer();
//        System.out.println(sb.capacity());//16
//        sb.append("abcdefghijklmnop");
//        System.out.println(sb.capacity());//16
//        sb.append("q");
//        System.out.println(sb.capacity());//34
//    }
//}

//class StringBufferDemo {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer(19);
//        System.out.println(sb.capacity());//19
//    }
//}

//
//class StringBufferDemo {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer(19);
//        System.out.println(sb.capacity());//19
//        sb.append("123632123456544sumAR");
//        System.out.println(sb.capacity());
//        //Newcapacity=(capacity+1)*2=(19+1)*2=40
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer("Ravi");
//        System.out.println(sb.capacity());//20
//    }
//}


//
//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer("Ravikant");
//        System.out.println(sb.length());//8
//        System.out.println(sb.capacity());//24
//        System.out.println(sb.charAt(7));//t
//        //System.out.println(sb.charAt(30));
//        //RE :StringIndexOutofBoundsException
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer("Ravikumar");
//        sb.setCharAt(8,'A');
//        System.out.println(sb);
//    }
//}

//class StringBufferDemo {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer();
//        sb.append("PI value is :");
//        sb.append(3.14);
//        sb.append(" this is exactly ");
//        sb.append(true);
//        System.out.println(sb);//PI value is :3.14 this is exactly true
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer("abcdefgh");
//        sb.insert(2, "xyz");
//        sb.insert(11,"9");
//        System.out.println(sb);//abxyzcdefgh9
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer("Ravikantkumar");
//        System.out.println(sb);//Ravikantkumar
//        sb.delete(6,13);
//        System.out.println(sb);//saichar
//        sb.deleteCharAt(5);
//        System.out.println(sb);//saichr
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer("Ravikumar");
//        System.out.println(sb);//Ravikumar
//        System.out.println(sb.reverse());//ramukivaR
//    }
//}



//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer("Ravikumar");
//        sb.setLength(6);
//        System.out.println(sb);//Ravik  last in null value
//    }
//}


//class StringBufferDemo {
//    public static void main(String[] args)
//    {
//        StringBuffer sb=new StringBuffer(1000);
//        System.out.println(sb.capacity());//1000
//        sb.append("Ravi");
//        System.out.println(sb.capacity());//1000
//        sb.trimToSize();
//        System.out.println(sb.capacity());//5
//    }
//}

//class StringBufferDemo {
//    public static void main(String[] args){
//        StringBuffer sb=new StringBuffer();
//        System.out.println(sb.capacity());//16
//        sb.ensureCapacity(1000);
//        System.out.println(sb.capacity());//1000
//    }
//}


