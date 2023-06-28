import java.util.*;
class ArraySum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        int a[]=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
            sum+= a[i];
        }
        System.out.println("Sum of array elements : "+sum);
    }
}