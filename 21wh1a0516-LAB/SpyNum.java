import java.util.*;


class SpyNum{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int temp = n;
        int prod = 1;
        int sum = 0;

        while(temp>0){
            int ld = temp%10;
            prod *= ld;
            sum += ld;
            temp /= 10;
        }

        if(sum == prod){
            System.out.println("true");
        }else{
        System.out.println("false");
        }

    }
}
