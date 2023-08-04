import java.util.*;
import java.io.*;

class AppendContentsFile{
    public static void main(String args[]) throws IOException{
        
        DataInputStream dis1 = new DataInputStream(System.in);       
        FileOutputStream fout1 = new FileOutputStream("File1.txt");
        char ch;
        System.out.println("Enter text into file 1 and # at end:");
        while((ch=(char)dis1.read()) != '#'){
            fout1.write(ch);
        }
        fout1.close();

     
        DataInputStream dis2 = new DataInputStream(System.in); 
        FileOutputStream fout2 = new FileOutputStream("File2.txt");
        System.out.println("Enter text into file 2 and # at end:");
        while((ch=(char)dis2.read()) != '#'){
            fout2.write(ch);
        }
        fout2.close();


        FileInputStream fin1 = new FileInputStream("File1.txt");
        FileInputStream fin2 = new FileInputStream("File2.txt");

        FileOutputStream fout3 = new FileOutputStream("File3.txt",true);
        int c;       
        while((c=fin1.read()) != -1){
            fout3.write(c);
        }
        while((c=fin2.read()) != -1){
            fout3.write(c);
        }
        
        fin1.close();
        fin2.close();
        fout3.close();

        FileInputStream fin3 = new FileInputStream("File3.txt");
        int x;
        System.out.println("Contents of file 3");
        while((x=fin3.read()) != -1){
            System.out.print((char)x);
        }
        fin3.close();
    } 
}

