package javaprograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChotaBheemLaddus {
	
	    public static int findMaxLaddus(String ladduTypes) {
	        String[] typesArray = ladduTypes.split(",");
	        Set<Integer> uniqueTypes = new HashSet<>();

	        for (String type : typesArray) {
	            uniqueTypes.add(Integer.parseInt(type));

	            if (uniqueTypes.size() >= typesArray.length / 2) {
	                break;
	            }
	        }

	        return uniqueTypes.size();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input
	        String ladduTypes = scanner.nextLine();

	        // Find the maximum number of laddus Chota Bheem can eat
	        int maxLaddus = findMaxLaddus(ladduTypes);

	        // Print the result
	        System.out.println(maxLaddus);

	        scanner.close();
	    }
	}
