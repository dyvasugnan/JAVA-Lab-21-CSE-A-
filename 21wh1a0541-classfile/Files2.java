package javagui3;
import java.io.*;
public class Files2 {
    public static void main(String[] args) throws IOException {
        	FileInputStream fin =  new FileInputStream("UserInputToFile.txt");
            int ch;
            while((ch = fin.read())!=-1) {
                System.out.print((char)ch);
            }
        fin.close();
    }
}

