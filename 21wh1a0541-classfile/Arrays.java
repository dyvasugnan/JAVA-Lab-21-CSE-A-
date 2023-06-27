package java21541;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("elements are ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }   
    }
}
