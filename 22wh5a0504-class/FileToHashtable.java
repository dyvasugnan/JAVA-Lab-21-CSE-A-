import java.io.*;
import java.util.*;

public class FileToHashtable {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\java_programs\\student.txt");
            Scanner sc = new Scanner(fis).useDelimiter(" ");
            Hashtable<String, String> ht = new Hashtable<String, String>();
            while(sc.hasNext())
            {
                String s = sc.nextLine();
                String[] str = s.split(" ");
                ht.put(str[0],str[1]);
            }
            for (Map.Entry<String, String> entry : ht.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
    }
}
