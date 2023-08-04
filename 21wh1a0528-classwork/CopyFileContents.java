import java.util.*;
import java.io.*;

class CopyFileContents{
    public static void main(String args[]) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("MyFile.txt");
        char ch;
        System.out.println("Enter text and # at end:");
        while((ch=(char)dis.read()) != '#'){
            fout.write(ch);
        }
        fout.close();

        FileInputStream fin = new FileInputStream("MyFile.txt");
        FileOutputStream fout1 = new FileOutputStream("UpperCase.txt");
        int c;
        while((c=fin.read()) != -1){
            if(c>=97 && c<=122){
                c = c-32;
                fout1.write((char)c);
            }
            else if(c>=65 && c<=90)
                fout1.write((char)c);
        }
        fin.close();
        fout1.close();

        FileInputStream fin1 = new FileInputStream("UpperCase.txt");
        int x;
        while((x=fin1.read()) != -1){
            System.out.print((char)x);
        }
        fin1.close();
    } 
}

