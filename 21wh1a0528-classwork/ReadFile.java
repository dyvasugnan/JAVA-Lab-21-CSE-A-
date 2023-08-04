import java.util.*;
import java.io.*;

class ReadFile{
    public static void main(String args[])throws IOException{
    FileReader fr = new FileReader("Sample.txt");
    int ch;
    while((ch=fr.read())!=-1){
        System.out.print((char)ch);
    }
    fr.close();
}
}







