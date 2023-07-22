package javalab;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Akshaya";
		//here we try few string methods
		boolean a = name.equals("akshaya"); //false
		boolean b = name.equalsIgnoreCase("akshaya"); //true
		int x = name.length(); //diff from length
		char c = name.charAt(0);
		int y = name.indexOf("A");
		boolean d = name.isEmpty();
		String z = name.toUpperCase();
		String q = name.trim(); //to remove empty spaces before and after
		String s = name.replace('s', 'q');
		
		System.out.println("is the string same as 'akshaya': " + a);
		System.out.println("is the string same as 'akshaya': " + b);
		System.out.println("lenght of string : " + x);
		System.out.println("Char at 0 : " + c);
		System.out.println("Index of A : " + y);
		System.out.println("is the string empty : " + d);
		System.out.println("String to upper case : " + z);
		System.out.println("remove empty spaces around the string : " + q);
		System.out.println("replace 's' to 'q' : " + s);
	}

}
