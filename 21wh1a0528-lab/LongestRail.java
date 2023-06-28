import java.util.*;

public class LongestRail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of compartments: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the IDs : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
       int c=1,max=1;
       for(int i=1;i<n;i++){
        if((a[i-1]+1)==a[i]){
            c++;
        }
        else{
            max = (c>max)?c:max;
            c=1;
        }
        max = (c>max)?c:max;
       }
       System.out.println(max);
    }
}
