import java.util.*;

public class Train {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.print("Enter array elements : ");
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int l = 0;
            int curr = 1;
            for(int i=1;i<a.length;i++){
                if(a[i]!=a[i-1]){
                    if(a[i]== a[i-1]+1){
                            curr++;
                    }
                    else{
                        curr = 1;
                    }
                l = Math.max(l,curr);
                }
            }   
        System.out.println(l);
    }
}
