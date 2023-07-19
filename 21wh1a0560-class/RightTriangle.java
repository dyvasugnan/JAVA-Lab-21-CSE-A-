/*
Sample Input 0
5

Sample Output 0
+
| \
|   \
|     \
+-------+
*/
import java.util.*;
class RightTriangle{
    public static void main(String[] args){
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++){
        for(j=1;j<=2*i-1;j++){
            if(i==1 || i==n){
                if(j>1 && j<2*i-1)
                    System.out.print("-");
                else
                    System.out.print("+");
            }
            else{
                if(j==1)
                    System.out.print("| ");
                else if(j==2*i-1)
                    System.out.print("\\");
                else if(j != 2*i-2){
                    System.out.print(" ");
            }
            }
        }
        System.out.print("\n");
    }
    }
}