//Pattern
import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i=0;i<n;i++){
            for(long j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}