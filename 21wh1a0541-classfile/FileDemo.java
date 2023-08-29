package javagui2;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        //fis.read()  method returns int one byte and returns -1 if data is not available
        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();
        //read methodreads data from file one byte it returns int so we can use type convertion
        System.out.println("data: " + data1);
        System.out.println("data:" + (char)data1);
        System.out.println("data: " + data2);
        System.out.println("data:" + (char)data2);
        System.out.println("data: " + data3);
        System.out.println("data:" + (char)data3);
        // to read  large number of bytes use while loop.
        int data;
        while((data = fis.read())!=-1) {
        	System.out.println("data:"+(char)data);
        }
        fis.close();
    }
}
