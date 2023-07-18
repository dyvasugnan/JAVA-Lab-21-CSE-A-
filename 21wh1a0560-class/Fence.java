import java.util.*;
import java.math.*;
class Fence{
    public static void main(String args[]){
        int area;
        Scanner sc = new Scanner(System.in);
        area = sc.nextInt();
        double fence = 4*Math.sqrt(area);
        System.out.print(fence);
    }
}