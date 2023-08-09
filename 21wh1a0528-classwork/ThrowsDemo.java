import java.util.*;
import java.io.*;
class Demo{
    String s;
    void input() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        s = br.readLine();
    }
    void display(){
        System.out.println(s);
    }
}
class ThrowsDemo{
    public static void main(String args[])throws IOException{
        Demo d= new Demo();
        d.input();
        d.display();
    } 
}

