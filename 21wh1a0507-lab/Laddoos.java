package java_codes;
import java.util.*;
public class Laddoos {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("enter n  ");
	        n = sc.nextInt();
	        int a []= new int[n];
	        for(int i = 0;i<n;i++){
	            a[i] = sc.nextInt();
	        }
	        int b[] = new int[n];
	        int k = 0;
	        b[k] = a[0];
	        k++;
	        for(int i =1;i<n;i++){
	            int flag = 0;
	            for(int j = 0;j<=k;j++){
	                if(a[i]==b[j]){
	                flag++;
	                break;
	                }
	                }
	        if(flag==0){
	        b[k] = a[i];
	        k++;}
	    }
	    
	    if(n/2<k)
	    System.out.println(n/2);
	    else
	    System.out.println(k);
	    }
}
