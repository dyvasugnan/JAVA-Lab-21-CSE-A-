// people are sitting around a circe and a ball is passed from one person to other person, starting at person P, in either clockwise or counter-clockwise direction and stops after K passes. Your task is to find the person at which ball stops. Assume that people are identified with their unique ids from 0 to N-1 in the sequence.
import java.util.*;
class CircularArith{
    public static void main(String args[]){
        int n,p,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        k = sc.nextInt();
        int res =  ((k % n)+p+n)%n;
        System.out.println("Ball stops at person : "+res);
    }
}