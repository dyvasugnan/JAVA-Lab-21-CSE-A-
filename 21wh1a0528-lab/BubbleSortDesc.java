
import java.util.*;

class BubbleSortDesc{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many : ");
    int n = sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" numbers : ");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int count= 0;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]<a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                count++;
            }
        }
    }
    System.out.print("After sorting\n");
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println("\nNumber of swaps : "+count);
    }
}

