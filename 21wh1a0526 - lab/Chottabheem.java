import java.util.*;
class Chottabheem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        int i ;
        int a []= new int[n];
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        int k = 0;
        b[k] = a[0];
        k++;
        for(i =1;i<n;i++){
            int flag = 0;
            for(j = 0;j<=k;j++){
                if(a[i]==b[j]){
                flag++;
                break;
        }}
        if(flag==0){
        b[k] = a[i];
        k++;}
    }
    for(i = 0;i<k;i++)
    System.out.print(b[i]);
    if(n/2<k)
    System.out.println(n/2);
    else
    System.out.println(k);
}}


