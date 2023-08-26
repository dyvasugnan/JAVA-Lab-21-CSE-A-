import java.io.*;
import java.util.*;

public class HashTableFile 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\JavaFolder\\hashfile.txt");
        Scanner sc = new Scanner(fis).useDelimiter(",");
        Hashtable<String, String> ht = new Hashtable<String, String>();
        String[] str;
        String s;
        while (sc.hasNextLine()) 
        {
            s = sc.nextLine();
            str = s.split(",");
            ht.put(str[0], str[1]);
        }
        
        Enumeration<String> keys = ht.keys();  
        while (keys.hasMoreElements())
        {
            String key = keys.nextElement();
            String value = ht.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        sc.close();
    }    
}
