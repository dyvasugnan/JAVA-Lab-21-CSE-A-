import java.util.*;
import java.io.*;

class Serialization{
    static class Emp implements Serializable{
        int id;
        String name;
        Emp(int x,String s){
            id = x;
            name = s;
        }
    }
    public static void main(String args[]) throws IOException{
        Emp e = new Emp(23,"abcd");
        FileOutputStream fos = new FileOutputStream("MyFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close();
    } 
}

