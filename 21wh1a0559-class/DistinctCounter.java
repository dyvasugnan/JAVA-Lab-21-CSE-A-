import java.util.Scanner;
import java.util.HashSet;

public class DistinctCounter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t,n,k,num,i,j;
        t = sc.nextInt();
        for (i=0;i<t;i++){
            n = sc.nextInt();
            k = sc.nextInt();
            HashSet<Integer> distinctIntegers = new HashSet<Integer>();
            for (j=0;j<n;j++){
                num = sc.nextInt();
                distinctIntegers.add(num);
            }
            if (distinctIntegers.size() == k)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
