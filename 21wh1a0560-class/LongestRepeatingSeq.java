import java.util.*;

class LongestrepeatingSeq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,curr=1,longest = 1;
        System.out.print("Enter array size : ");
        n = sc.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(i=1;i<n;i++){
            if(a[i-1] == a[i]){
                curr ++;
                longest = Math.max(longest, curr);
            }
            else{
                longest = Math.max(longest, curr);
                curr=1;
            }
        }
        System.out.print("\nLongest repeated sequence length : "+longest);
    }
}