import java.io.*;
class FileWriterDemo1 {
    public static void main(String[] args)throws IOException {
        PrintWriter pw=new PrintWriter("file3.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        String line=br.readLine();
        while(line!=null)
        {
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("file2.txt")); //reuse
        line=br.readLine();
        while(line!=null) {
            pw.println(line);
            line=br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
    }
}




//import java.io.*;
//class FileWriterDemo1 {
//    public static void main(String[] args)throws IOException {
//        PrintWriter pw=new PrintWriter("file3.txt");
//        BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
//        BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
//        String line1=br1.readLine();
//        String line2=br2.readLine();
//        while(line1!=null||line2!=null) {
//            if(line1!=null) {
//                pw.println(line1);
//                line1=br1.readLine();
//            }
//            if(line2!=null) {
//                pw.println(line2);
//                line2=br2.readLine();
//            }
//        }
//        pw.flush();
//        br1.close();
//        br2.close();
//        pw.close();
//    }
//}





//import java.io.*;
//class TotalFileMerge {
//    public static void main(String[] args)throws IOException {
//        PrintWriter pw=new PrintWriter("output.txt");
//        File f=new File("A:\\Notes\\c lange\\Project1\\NewJava\\second.txt");
//        String[] s=f.list();
//        for(String s1:s) {
//            BufferedReader br=new BufferedReader(new File(f,s1));
//            String line=br.readLine();
//            while(line!=null){
//                pw.println(line);
//                line=br.readLine();
//            }
//        }
//        pw.flush();
//    }
//}



//
//import java.io.*;
//class FileWriterDemo1 {
//    public static void main(String[] args)throws IOException {
//        BufferedReader br1=new BufferedReader(new FileReader("input.txt"));
//        PrintWriter out=new PrintWriter("output.txt");
//        String target=br1.readLine();
//        while(target!=null) {
//            boolean available=false;
//            BufferedReader br2=new BufferedReader(new FileReader("output.txt"));
//            String line=br2.readLine();
//            while(line!=null)
//            {
//                if(target.equals(line))
//                {
//                    available=true;
//                    break;
//                }
//                line=br2.readLine();
//            }
//            if(available==false) {
//                out.println(target);
//                out.flush();
//            }
//            target=br1.readLine();
//        }
//    }
//}