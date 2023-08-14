import java.util.*;

class BubbleSort{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int c=0,temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]<a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                c++;
            }
        }
    }
    for(int i=0;i<n;i++){
        
        System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("Number of swaps : "+c);
    }
}
