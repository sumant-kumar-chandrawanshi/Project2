//
//import java.io.*;
//class FileReaderDemo {
//    public static void main(String[] args)throws IOException {
//        FileReader fr=new FileReader("cricket.txt");
//        int i=fr.read(); //more amount of data
//        while(i!=-1)
//        {
//            System.out.print((char)i); i=fr.read();
//        }


import java.io.*;
class FileReaderDemo {
    public static void main(String[] args)throws IOException {
        File f=new File("cricket.txt");
        FileReader fr=new FileReader(f);
        char[] ch=new char[(int)f.length()]; //small amount of data
        fr.read(ch);
        for(char ch1:ch) {
            System.out.print(ch1);
        }
    }
}
