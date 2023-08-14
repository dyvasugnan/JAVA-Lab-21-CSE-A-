import java.util.*;
import java.lang.*;
class Bubblesort {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter size: ");
        n = sc.nextInt();
        int a[] = new int[n];
	System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                    count++;
                }
            }
        }
	System.out.println("After Sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("count:" +count);
    }
}
