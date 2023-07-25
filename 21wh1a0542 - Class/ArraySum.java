import java.util.*;
import java.lang.*;
class ArraySum{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    
    int n,add = 0,i; 
    int x[] = new int [100];
    
        System.out.println("Enter the size of the array : ");
    
    n = s.nextInt();
    
        System.out.println("Enter the elements into the array : ");
    
            for(i = 0;i<n;i++){
    
    x[i] = s.nextInt();
    
        add = add + x[i];}
    
        System.out.println("Sum : "+add);
    }
}