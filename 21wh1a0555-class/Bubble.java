import java.util.*;
class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements into the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}