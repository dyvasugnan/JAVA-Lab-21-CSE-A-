import java.util.*;
import java.io.*;

class WriteIntoFile{
    public static void main(String args[]) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("MyFile.txt");
        char ch;
        System.out.println("Enter text and # at end:");
        while((ch=(char)dis.read()) != '#'){
            fout.write(ch);
        }
        fout.close();
    } 
}

