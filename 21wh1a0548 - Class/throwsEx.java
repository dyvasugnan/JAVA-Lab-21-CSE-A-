import java.io.*;
public class Demo {
	String str;
	void get()throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		str=br.readLine();
	}
	void print(){
		System.out.println(str);
	}
}
	
public class ExceptionEx{
    public static void main(String[] args) throws IOException {
		Demo d=new Demo();
		d.get();
		d.print();
	}
}