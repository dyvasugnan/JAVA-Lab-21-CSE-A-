import java.util.*;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.print("it is even number");
        }
        else{
            System.out.print("it is odd number");
        }
    }
}