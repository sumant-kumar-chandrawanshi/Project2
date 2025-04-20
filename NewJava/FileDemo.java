//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        File f=new File("cricket.txt");
//        System.out.println(f.exists());//false
//        f.createNewFile();
//        System.out.println(f.exists());//true
//    }
//}

//
//
//import java.io.*;
//class FileDemo{
//    public static void main(String[] args)throws IOException {
//        File f=new File("cricket123");
//        System.out.println(f.exists());//false
//        f.mkdir();
//        System.out.println(f.exists());//true
//    }
//}

//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        File f=new File("demo.txt");
//        f.createNewFile();
//    }
//}

//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        File f1=new File("Ravikant123");
//        f1.mkdir();
//        File f2=new File("Ravikant123","abc.txt");
//        f2.createNewFile();
//    }
//}
//
//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        File f=new File("A:\\Notes\\c lange\\Project1\\NewJava\\Ravikant123","demo.txt");
//        f.createNewFile();
//    }
//}


//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        int count=0;
//        File f=new File("A:\\Notes\\c lange\\Project1\\NewJava");
//        String []s=f.list();
//        for(String s1:s) {
//            count++;
//            System.out.println(s1);
//        }
//        System.out.println("total number : "+count);
//    }
//}



//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        int count=0;
//        File f=new File("A:\\\\Notes\\\\c lange\\\\Project1\\\\NewJava");
//        String[] s=f.list();
//        for(String s1:s) {
//            File f1=new File(f,s1);
//            if(f1.isFile()) {
//                count++;
//                System.out.println(s1);
//            }
//        }
//        System.out.println("total number : "+count);
//    }
//}


//
//import java.io.*;
//class FileDemo {
//    public static void main(String[] args)throws IOException {
//        int count=0;
//        File f=new File("A:\\\\Notes\\\\c lange\\\\Project1\\\\NewJava");
//        String[] s=f.list();
//        for(String s1:s) {
//            File f1=new File(f,s1);
//            if(f1.isDirectory()) {
//                count++;
//                System.out.println(s1);
//            }
//        }
//        System.out.println("total number : "+count);
//    }
//}

