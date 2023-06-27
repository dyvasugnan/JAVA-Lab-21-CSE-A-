package java21541;
import java.util.Arrays;
import java.util.Scanner;
 class SortNames{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements");
            a[i] = sc.next();
        }
        System.out.println("original array:" + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("swapped array:" + Arrays.toString(a));
    }
}
