import java.io.*;
public class Files {
    public static void main(String[] args) throws IOException {
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("sample.txt", true);
        char ch;
        System.out.println("enter the text till $");
        while((ch=(char)dis.read())!='$'){
            fout.write(ch);
        }
        fout.close();
    }
}
