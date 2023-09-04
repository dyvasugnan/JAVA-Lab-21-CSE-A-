package javaprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("Phonebook.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    phoneBook.put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a name or phone number (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String result = phoneBook.get(input);

            if (result != null) {
                if (input.equals(result)) {
                    System.out.println("Name: " + input + " | Phone Number: " + result);
                } else {
                    System.out.println("Name: " + result + " | Phone Number: " + input);
                }
            } else {
                System.out.println("Entry not found.");
            }
        }

        scanner.close();
    }
}
