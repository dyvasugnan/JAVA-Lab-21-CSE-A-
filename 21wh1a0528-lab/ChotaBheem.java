
 import java.util.*;
public class ChotaBheem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String laddusStr[] = scanner.nextLine().split(",");
	        int n=laddusStr.length;
	        int laddus[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            laddus[i] = Integer.parseInt(laddusStr[i]);
	        }
	       Arrays.sort(laddus);
	       int c = 0;
	       
	       for(int i=1;i<n;i++){
               if(laddus[i-1]==laddus[i])
                    c++;
            }
        if((n-c) >= (n/2))
            System.out.println(n/2);
        else
             System.out.println(n-c);
	    }
	} 