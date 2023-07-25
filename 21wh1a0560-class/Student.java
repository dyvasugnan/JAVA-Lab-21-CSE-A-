import java.io.*;
import java.util.StringTokenizer; 
public class Student {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter name, age, gender, marks separated by comma (,)");
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		String s1,s2,s3,s4;
		s1 = st.nextToken();
		s2 = st.nextToken();
		s3 = st.nextToken();
		s4 = st.nextToken();
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		s4 = s4.trim();
		String name = s1;
		int age = Integer.parseInt(s2);
		char gen = s3.charAt(0);
		float marks = Float.parseFloat(s4);
		System.out.print("Name : "+name+"\nAge : "+age+"\nGender : "+gen+"\nmarks : "+marks);
	}

}
