import java.lang.*;
import java.util.*;
class Bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();
        int a[] = new int[n];
        int count=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
        }
    
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
        System.out.println(count);
       
   }
}
