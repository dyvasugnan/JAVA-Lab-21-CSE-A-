import java.util.*;
import java.io.*;
class File1{
        public static void main(String args[]) throws IOException{
                System.out.print("ENter text with @ in the end : ");
                DataInputStream dis = new DataInputStream(System.in);
                FileOutputStream fout = new FileOutputStream("File.txt",true);
                char ch;
                while((ch = (char)dis.read()) != '@')
                        fout.write(ch);
                fout.close();
                System.exit(0);
        }
}
