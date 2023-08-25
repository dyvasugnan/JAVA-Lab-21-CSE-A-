import java.util.*;

public class VectorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        while (true) {
            System.out.print("\nMenu:\n" +
                    "1. Add a value\n" +
                    "2. Remove a value\n" +
                    "3. Display all values\n" +
                    "4. Clear vector\n" +
                    "5. Get vector size\n" +
                    "6. Get index of value\n" +
                    "7. Get capacity\n" +
                    "8. Get value by index\n" +
                    "9. Set value by index\n" +
                    "10. Check if value exists\n" +
                    "11. Exit\n" +
                    "Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int valueToAdd = sc.nextInt();
                    v.add(valueToAdd);
                    System.out.println("Value added to vector.");
                    break;

                case 2:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = sc.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < v.size()) {
                        v.remove(indexToRemove);
                        System.out.println("Value removed from vector.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.println("Values in vector: " + v);
                    break;

                case 4:
                    v.clear();
                    System.out.println("Vector cleared.");
                    break;

                case 5:
                    System.out.println("Size of vector: " + v.size());
                    break;

                case 6:
                    System.out.print("Enter value to find index of: ");
                    int valueToFind = sc.nextInt();
                    int index = v.indexOf(valueToFind);
                    if (index != -1) {
                        System.out.println("Index of value " + valueToFind + ": " + index);
                    } else {
                        System.out.println("Value not found in vector.");
                    }
                    break;

                case 7:
                    System.out.println("Capacity of vector: " + v.capacity());
                    break;

                case 8:
                    System.out.print("Enter index to get value: ");
                    int indexToGet = sc.nextInt();
                    if (indexToGet >= 0 && indexToGet < v.size()) {
                        int retrievedValue = v.get(indexToGet);
                        System.out.println("Value at index " + indexToGet + ": " + retrievedValue);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 9:
                    System.out.print("Enter index to set value: ");
                    int indexToSet = sc.nextInt();
                    if (indexToSet >= 0 && indexToSet < v.size()) {
                        System.out.print("Enter new value: ");
                        int newValue = sc.nextInt();
                        v.set(indexToSet, newValue);
                        System.out.println("Value set at index " + indexToSet + ".");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 10:
                    System.out.print("Enter value to check: ");
                    int valueToCheck = sc.nextInt();
                    if (v.contains(valueToCheck)) {
                        System.out.println("Value exists in vector.");
                    } else {
                        System.out.println("Value does not exist in vector.");
                    }
                    break;

                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
