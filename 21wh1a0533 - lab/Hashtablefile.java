package Javaclss;
import java.util.*;
import java.io.*;

public class Hashtablefile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\91707\\eclipse-workspace\\JavaLab\\src\\Javaclss\\employee.txt");
            Scanner sc = new Scanner(fis);
            Hashtable<String, String> ht = new Hashtable<>();
            String[] str;
            String s;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                str = s.split(",");
                if (str.length == 2) { 
                    ht.put(str[0], str[1]);
                }
            }
            Enumeration<String> e = ht.keys(); 
            while (e.hasMoreElements()) {
            	String key = e.nextElement();
                String value = ht.get(key);
                System.out.println("Student: " + key + ", marks: " + value);
            }
            System.out.println("Provide name: ");
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            if(ht.containsKey(s1)) {
            	String s2 = ht.get(s1);
            	System.out.println("marks: "+s2);
            }
            else {
            	System.out.println("Not found!!!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
