import java.util.*;
import java.io.*;

class WriteFile{
    public static void main(String args[])throws IOException{
    FileWriter fw = new FileWriter("Sample.txt");
    String str="abcd hello";
    for(int i=0;i<str.length();i++){
        fw.write(str.charAt(i));
    }
    fw.close();
}
}