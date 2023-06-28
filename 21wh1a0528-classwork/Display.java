import java.util.*;


class Display{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=Math.sqrt(i);k++){
                if(i==(k+1)*k){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("");

     }
}