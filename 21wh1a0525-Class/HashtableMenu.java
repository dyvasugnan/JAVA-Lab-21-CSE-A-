import java.util.*;

public class HashtableMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> ht = new Hashtable<>();

        while (true) {
            System.out.print("\nMenu:\n" +
                    "1. Put a value\n" +
                    "2. Remove a value\n" +
                    "3. Display all values\n" +
                    "4. Clear hashtable\n" +
                    "5. Get hashtable size\n" +
                    "6. Check if key exists\n" +
                    "7. Exit\n" +
                    "Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = sc.next();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    ht.put(key, value);
                    System.out.println("Value added to hashtable.");
                    break;

                case 2:
                    System.out.print("Enter key to remove: ");
                    String keyToRemove = sc.next();
                    if (ht.containsKey(keyToRemove)) {
                        ht.remove(keyToRemove);
                        System.out.println("Value removed from hashtable.");
                    } else {
                        System.out.println("Key not found in hashtable.");
                    }
                    break;

                case 3:
                    System.out.println("Values in hashtable:");
                    Enumeration<String> keys = ht.keys();
                    while (keys.hasMoreElements()) {
                        String currentKey = keys.nextElement();
                        System.out.println("Key: " + currentKey + ", Value: " + ht.get(currentKey));
                    }
                    break;

                case 4:
                    ht.clear();
                    System.out.println("Hashtable cleared.");
                    break;

                case 5:
                    System.out.println("Size of hashtable: " + ht.size());
                    break;

                case 6:
                    System.out.print("Enter key to check: ");
                    String keyToCheck = sc.next();
                    if (ht.containsKey(keyToCheck)) {
                        System.out.println("Key exists in hashtable. Key: " + keyToCheck + ", Value: " + ht.get(keyToCheck));
                    } else {
                        System.out.println("Key does not exist in hashtable.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
