package javalab;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.length() < 2) {
            System.out.println(inputString);
        } else {
            char previousChar = inputString.charAt(0);
            System.out.print(previousChar);

            for (int i = 1; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                if (currentChar != previousChar) {
                    System.out.print(currentChar);
                    previousChar = currentChar;
                }
            }
        }
    }
}
