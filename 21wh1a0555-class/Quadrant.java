package hello;
import java.lang.*;
import java.util.*;
class Quadrant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int coord_1 = sc.nextInt();
        int coord_2 = sc.nextInt();
        if(coord_1>0 && coord_2>0){
            System.out.println("1");
        }
        else if(coord_1<0 && coord_2>0){
            System.out.println("2");
        }
        else if(coord_1<0 && coord_2<0){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
    }
}