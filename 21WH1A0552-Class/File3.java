import java.util.*;
import java.lang.*;
import java.io.*;
class File3{
        public static void main(String args[]) throws IOException{
                FileInputStream fis = new FileInputStream("File.txt");
                FileOutputStream fos = new FileOutputStream("upperCase.txt");
                int ch;
                while((ch = fis.read()) != -1){
                        if(ch >= 97 && ch <= 122){
                                ch -= 32;
                                fos.write((char)ch);
                        }
                        else if(ch >= 65 && ch <= 90)
                               fos.write((char)ch);
                }
                fis.close();
                fos.close();
        }
}
