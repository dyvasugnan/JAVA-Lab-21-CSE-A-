package java_codes;
import java.io.*;
import java.util.*;
public class FileToHashTable {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Priya\\OneDrive\\Desktop\\New folder");
            Scanner sc = new Scanner(fis).useDelimiter("\t");

            Hashtable<String, String> ht = new Hashtable<String, String>();

            System.out.println("hash table values are : ");
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] str = s.split("\t");
                if (str.length == 2) {
                    ht.put(str[0], str[1]);
                    System.out.println(str[0] + " : " + str[1]);
                }
            }

            Scanner sca = new Scanner(System.in);
            System.out.print("Enter the name as given in the phone book: ");
            String name = sca.next();

            String phoneNumber = ht.get(name);
            if (phoneNumber != null) {
                System.out.println("Phone number is: " + phoneNumber);
            } else {
                System.out.println("Name not found in the phone book.");
            }

            fis.close(); // Close the FileInputStream
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
