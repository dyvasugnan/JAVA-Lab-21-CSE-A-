package classprogram;
import java.util.*;
public class LargeSequence {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        int i ;
        int a []= new int[n];
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i = 0;i<n;i++){
            for(j = 0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        int count=0,max=0;
        for(i = 1;i<n;i++){
            if(a[i]-a[i-1]==1){
            count++;
            if(count>max)
            max = count;
            }
            else
            count = 0;
           
        }
        System.out.print(max+1);}}


