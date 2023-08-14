import java.util.*;
public class Bubblesort
{
public static void main(String[] args) {
int n;
Scanner sc= new Scanner(System.in);
System.out.println("enter size of array :");
n=sc.nextInt();
int a[]=new int[n];


for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
System.out.println("before sorting :");
for(int i=0;i<n;i++){
   System.out.print(a[i]+" ");
}
int cnt =0;
for(int i=0;i<n;i++){
   for(int j=0;j<n-i-1;j++){
       if(a[j]>a[j+1]){
           int temp=a[j];
           a[j]=a[j+1];
           a[j+1]=temp;
           cnt++;
       }
   }
   
}
System.out.println("after sorting: ");
for(int k=0;k<n;k++){
       System.out.print(a[k]+" ");
   }
  System.out.println("no of swaps : "+cnt);

}
} 
