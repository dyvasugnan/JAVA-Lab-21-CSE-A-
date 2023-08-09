import java.util.*;
import java.io.*;
class Emp implements Serializable{
        int id;
        String name;
        Emp(int x,String y){
                id = x;
                name = y;
        }
}
class ObjFile{
        public static void main(String args[]) throws IOException{
                Emp e = new Emp(10,"abkfjidfuidcd");
                FileOutputStream fos = new FileOutputStream("JavaFile.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(e);
                oos.close();
        }
}
