package hello;
import java.lang.*;
import java.util.*;

public class JudgingMoose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int l;//no.of tines on left
        int r;//no.of tines on right side
        l = sc.nextInt();
        r = sc.nextInt();
        if(l==r && l>0 && r>0){
            int sum = l+r;
            System.out.println("Even "+sum);
        }
        else if(l!=r){
            if(l>r){
                int mul = 2*l;
                System.out.println("Odd "+mul);
            }
            else{
                int mul1 = 2*r;
                System.out.println("Odd "+mul1);
            }
            
        }
        else{
            System.out.println("Not a moose");
        }

	}

}
