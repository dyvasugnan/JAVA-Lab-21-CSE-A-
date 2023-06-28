package javalab;

import java.util.Scanner;

public class Topper {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] marks = new int[N];
        for (int i = 0; i < N; i++) {
            marks[i] = scanner.nextInt();
        }
        int[] frequent = new int[1001]; 
        for (int i = 0; i < N; i++) {
            frequent[marks[i]]++;
        }
        int topper = -1;
        for (int i = 1000; i >= 0; i--) {
            if (frequent[i] > 1) {
                continue;
            }
            if (frequent[i] == 1) {
                topper = Math.max(topper, i);
            }
        }
        System.out.println(topper);
    }
}
