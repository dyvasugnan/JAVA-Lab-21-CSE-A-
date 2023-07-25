package javaprograms;

public class RemoveAdjacentDuplicates {
	    public static String removeDuplicates(String str) {
	        if (str.length() <= 1) {
	            return str;
	        }

	        if (str.charAt(0) == str.charAt(1)) {
	            int index = 2;
	            while (index < str.length() && str.charAt(0) == str.charAt(index)) {
	                index++;
	            }
	            return removeDuplicates(str.substring(index));
	        } else {
	            return str.charAt(0) + removeDuplicates(str.substring(1));
	        }
	    }

	    public static void main(String[] args) {
	        String input1 = "Geeksforgeeks";
	        String output1 = removeDuplicates(input1);
	        System.out.println("Input: " + input1);
	        System.out.println("Output: " + output1);

	        String input2 = "ntcctg";
	        String output2 = removeDuplicates(input2);
	        System.out.println("Input: " + input2);
	        System.out.println("Output: " + output2);
	    }
}
