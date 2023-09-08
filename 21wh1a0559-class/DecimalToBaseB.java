import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBaseB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int[] inp = new int[2];
            inp[0] = scanner.nextInt();
            inp[1] = scanner.nextInt();
            decimalToBaseB(inp[0], inp[1]);
        }
    }
    
    public static void decimalToBaseB(int n, int b) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        while (n > 0) {
            temp.add(0, n % b);
            n = n / b;
        }
        
        for (int digit : temp) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
