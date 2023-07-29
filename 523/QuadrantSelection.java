package javalab;
import java.util.Scanner;
public class QuadrantSelection {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    if(x>0 && y>0){
        System.out.print("Quadrant is 1");
    }
    else if(x<0 && y>0){
    	System.out.print("Quadrant is 2");
    }
    else if(x<0 && y<0){
    	System.out.print("Quadrant is 3");
    }
    else 
    	System.out.print("Quadrant is 4");
}
}
