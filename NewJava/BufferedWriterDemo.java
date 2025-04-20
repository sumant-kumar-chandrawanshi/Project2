//import java.io.*;
//class BufferedWriterDemo {
//    public static void main(String[] args)throws IOException {
//        FileWriter fw=new FileWriter("cricket.txt");
//        BufferedWriter bw=new BufferedWriter(fw);
//        bw.write(100);
//        bw.newLine();
//        char[] ch={'a','b','c','d'};
//        bw.write(ch);
//        bw.newLine();
//        bw.write("Ravikant");
//        bw.newLine();
//        bw.write("software solutions");
//        bw.flush();
//        bw.close();
//    }
//}


//import java.io.*;
//class BufferedReaderDemo {
//    public static void main(String[] args)throws IOException{
//        FileReader fr=new FileReader("cricket.txt");
//        BufferedReader br=new BufferedReader(fr);
//        String line=br.readLine();
//        while(line!=null)
//        {
//            System.out.println(line); line=br.readLine();
//        }
//        br.close();
//    }
//}



//import java.io.*;
//class PrintWriterDemo {
//    public static void main(String[] args)throws IOException {
//        FileWriter fw=new FileWriter("cricket.txt");
//        PrintWriter out=new PrintWriter(fw);
//        out.write(100);
//        out.println(100);
//        out.println(true);
//        out.println('c');
//        out.println("Ravikant");
//        out.flush();
//        out.close();
//    }
//}



