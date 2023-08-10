package moulikaLab;

import java.lang.*;
import java.util.StringTokenizer;
import java.io.*;

public class MultiVariableInput {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		String s1= st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		String Name = s1;
		int age = Integer.parseInt(s2);
		float marks = Float.parseFloat(s3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
