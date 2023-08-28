package javalab;
import java.util.*;
import java.io.*;
public class FileToHashTable {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Akshaya\\eclipse-workspace\\COllections\\src\\javalab\\SampleText.txt");
            Scanner sc = new Scanner(fis);
            Hashtable<String, String> ht = new Hashtable<>();
            String[] str;
            String s;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                str = s.split(",");
                if (str.length == 2) { // Ensure there are two elements in the array
                    ht.put(str[0], str[1]);
                }
            }
            sc.close();

         …
