import java.util.*;
import java.lang.*;
class StringSort{
    public static void main(String args[]){
        int i,n,j;
        String t ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr no. of strings : ");
        n  =sc.nextInt();
        String s [] = new String[n];
        for(i=0;i<n;i++)
        s[i] = sc.next();
        for(i = 0;i<n;i++){
            for(j = 0;j<n-i-1;j++){
                if((s[j].compareTo(s[j+1]))>0){
                    t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
               
            }
        }
        for(i = 0;i<n;i++)
        System.out.println(s[i]);
       
    }
}
