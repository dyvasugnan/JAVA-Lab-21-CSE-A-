import java.util.*;
class Number{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        long n = sc.nextLong();
        long i=1;
        while(((i+1)*i)<=n){
            System.out.println((i+1)*i);
            i++;
        }
    }
}