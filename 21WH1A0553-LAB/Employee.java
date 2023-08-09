package clss;

import java.util.*;
import java.io.*;
class Employee implements Serializable{
        int id;
        String name;
        Employee(int x,String y){
                id = x;
                name = y;
        }
}
class ObjFile{
        public static void main(String args[]) throws IOException{
                Employee e = new Employee(10,"Pradeepthi");
                FileOutputStream fos = new FileOutputStream("JavaFile.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(e);
                oos.close();
        }
}