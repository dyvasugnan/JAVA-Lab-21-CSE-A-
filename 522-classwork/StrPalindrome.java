package classprogram;
import java.util.*;
import java.lang.*;
public class StringPalindrome {
	public static void main(String args[]){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s = sc.next();
        int i,j,m,l,flag = 0;
        l = s.length();
        m = l-1;
        char str[]  = s.toCharArray();
        for(i= 0 ;i<l/2;i++){
            if(str[i]!=str[m-i]){
                flag++;
            }
        }
        if(flag ==0)
        System.out.print("yes");
        else
        System.out.print("No");
       
    }
}
