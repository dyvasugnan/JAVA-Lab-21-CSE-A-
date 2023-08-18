import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        long sum = 0;
 
        for (int i = 1; i <= w; i++) {
            sum = sum + (i * k);
        }
        
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
