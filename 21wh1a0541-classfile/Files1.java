package javagui3;

import java.io.*;

public class Files1 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("UserinputToFile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fout, 1024);
        int ch;
        System.out.println("Enter text till #");
        while ((ch = dis.read()) != '#') {
            fout.write(ch);
        }
        fout.close();
    }
}
