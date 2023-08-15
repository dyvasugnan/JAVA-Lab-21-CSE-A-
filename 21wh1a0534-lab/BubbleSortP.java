import java.util.*;
class BubbleSortP {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of the array");
     int n = sc.nextInt();
     int a[] = new int[n];
     System.out.println("enter the array elements");
     for(int i=0;i<n;i++) {
         a[i]=sc.nextInt();
     }
     System.out.print("elements before sorting");
     for(int i=0;i<n;i++) {
         System.out.println(a[i]);
     }
     int count=0;
     for(int i=0;i<n-1;i++) {
        for(int j=0;j<n-i-1;j++) {
            if(a[j]>a[j+1]) {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                count++;
            }
        }
     }
     System.out.println("number of passes are"+count);
     System.out.println("after sorting");
     for(int i=0;i<n;i++) {
         System.out.println(a[i]);
     }
    }
}
