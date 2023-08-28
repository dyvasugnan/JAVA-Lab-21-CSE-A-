import java.util.*;

public class DisplayValue {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        Scanner sc = new Scanner(System.in);
        ht.put("Sachin", 90);
        ht.put("Dhoni", 100);
        ht.put("Virat", 80);
        ht.put("Goutham", 150);
        Enumeration e = ht.keys();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        String name = sc.next();
        if(ht.containsKey(name))
            System.out.println(ht.get(name));
        else
            System.out.println("Key not found");
    }
}
