package javaprograms;


	public class StringMerger {
	    public static String mergeStrings(String s1, String s2) {
	        StringBuilder mergedString = new StringBuilder();

	        int i = 0, j = 0;
	        while (i < s1.length() && j < s2.length()) {
	            mergedString.append(s1.charAt(i++));
	            mergedString.append(s2.charAt(j++));
	        }

	        while (i < s1.length()) {
	            mergedString.append(s1.charAt(i++));
	        }

	        while (j < s2.length()) {
	            mergedString.append(s2.charAt(j++));
	        }

	        return mergedString.toString();
	    }

	    public static void main(String[] args) {
	        String s1 = "abcde";
	        String s2 = "12345";

	        String mergedString = mergeStrings(s1, s2);
	        System.out.println(mergedString);  // Output: a1b2c3d4e5
	    }
	}

