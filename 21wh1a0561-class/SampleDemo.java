package javalab;
import java.util.Scanner;
class Shirisha{
    int yash;
    String sname;
    Scanner sc = new Scanner(System.in);
    void read()
    {
    System.out.println("Enter yash :");
    yash = sc.nextInt();
    System.out.println("Enter sname :");
    sname = sc.next();
    }
    void display()
    {
        System.out.println("yash: " +yash);
        System.out.println("sname: " +sname);
    }
}
class SampleDemo{
    public static void main(String[] args){
        Shirisha s1 = new Shirisha();
        s1.read();
        s1.display();
    }
}