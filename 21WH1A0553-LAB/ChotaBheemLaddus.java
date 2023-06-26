package clss;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ChotaBheemLaddus {
	public static int findMaxLaddus(String ladduTypes) {
        String[] typesArray = ladduTypes.split(",");
        int[] uniqueTypes = new int[typesArray.length / 2];
        int uniqueCount = 0;

        for (String type : typesArray) {
            int ladduType = Integer.parseInt(type);
            boolean isUnique = true;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueTypes[i] == ladduType) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueTypes[uniqueCount] = ladduType;
                uniqueCount++;
            }

            if (uniqueCount >= typesArray.length / 2) {
                break;
            }
        }
        return uniqueCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ladduTypes = scanner.nextLine();
        int maxLaddus = findMaxLaddus(ladduTypes);
        System.out.println(maxLaddus);

        scanner.close();
    }
}