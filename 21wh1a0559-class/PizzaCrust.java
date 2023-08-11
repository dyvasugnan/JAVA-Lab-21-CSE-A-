import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r,c;
        double area,c_area;
        r = sc.nextInt(); 
        c = sc.nextInt();
        area = Math.PI * Math.pow(r, 2);
        c_area = Math.PI * Math.pow((r-c),2);
        String str = String.format("%.9f", (c_area/area)*100);
        System.out.print(str);
    }
}
