// given an array find the last occurence of the element and return index

import java.util.* ;
import java.io.*; 
class FindElement {
    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count = 0;
        for(int i=n-1; i>=0; i--)
        {
            if(a[i] == x)
            {
                count = 1;
                System.out.println(i);
                break;
            }
        }
        if(count == 0)
        System.out.println("-1");   
        
        
    }
}
