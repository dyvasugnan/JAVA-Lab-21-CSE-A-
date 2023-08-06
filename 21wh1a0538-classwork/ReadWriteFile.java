package classprogram;
import java.util.*;
import java.io.*;
public class ReadWriteFile {
   public static void main(String args[]) throws IOException {
   InputStreamReader isr = new InputStreamReader(System.in);
   FileOutputStream f = new FileOutputStream("file.txt");
   BufferedReader br = new BufferedReader(isr);
char ch;
   while((ch = (char)br.read())!='@'){
	   f.write(ch);
   }
   int c;
   FileInputStream f2 = new FileInputStream("file.txt");
	 while((c = f2.read())!=-1)  {
		 System.out.println((char)c);
	 }
   }
   
}
