import java.util.*;
import java.io.*;

class ReadFromFile{
    public static void main(String args[]) throws IOException{
        
        FileInputStream fin = new FileInputStream("MyFile.txt");
        int ch;

        while((ch=fin.read()) != -1){
            System.out.print((char)ch);
        }
        fin.close();
    } 
}

