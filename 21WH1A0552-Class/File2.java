//import java.util.*;
import java.io.*;
class File2{
        public static void main(String args[]) throws IOException{
                FileInputStream fis = new FileInputStream("File.txt");
                int ch;
                while((ch = fis.read()) != -1)
                        System.out.print((char)ch);
                fis.close();
        }
}
