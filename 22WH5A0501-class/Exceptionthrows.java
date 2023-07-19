import java.io.FileInputStream;
import java.io.*;
class Test{
    void findFile() throws IOException{
        FileInputStream fis=new FileInputStream("sample.txt");
    }
}
class Exceptionthrows {
    public static void main(String args[]){
        Test t=new Test();
        try{
            t.findFile();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}