import java.util.*;
class CinemaCrowds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 0, count = 0;
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        for(int j=0;j<m;j++){
            if (s + a[j] <= n){
                s = s + a[j];
            }
            else{
                count ++;
            }
        }
        System.out.println(count);
    }
}