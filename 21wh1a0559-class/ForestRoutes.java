import java.util.Scanner;

public class ForestRoutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int[] cx = new int[c];
        int[] cy = new int[c];
        for (int i = 0; i < c; i++) {
            cx[i] = scanner.nextInt();
            cy[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for (int j = 0; j < q; j++) {
            int checkpoint = scanner.nextInt();
            char coordinate = scanner.next().charAt(0);
            if (coordinate == 'x') {
                System.out.println(cx[checkpoint]);
            } else {
                System.out.println(cy[checkpoint]);
            }
        }
    }
}
