import java.util.*;
import java.io.*;
	public class FileToTable {
		public static void main(String[] args) throws FileNotFoundException { 
			try {            
				FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\21wh1a0533\\src\\main\\java\\abc.txt");            
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
				System.out.println("Student: " + key + ", roll no: " + value);              
				}            System.out.println("Provide name: ");            
				Scanner scanner = new Scanner(System.in);            
				String s1 = scanner.next();            
				if(ht.containsKey(s1)) {            
					String s2 = ht.get(s1);            
					System.out.println("roll no: "+s2);            
					}            
				else {          
					System.out.println("Not found!!!");            
				}        
				} 
			catch (FileNotFoundException e) {            
				e.printStackTrace();        
				}    
		}
}

