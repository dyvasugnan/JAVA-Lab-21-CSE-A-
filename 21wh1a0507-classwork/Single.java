package java_codes;
class mul {
    public int mulNumbers(int a, int b) {
        return a * b;
    }
}
class div extends mul {
    public int divNumbers(int a, int b) {
        return a / b;
    }
}



public class Single {
	public static void main(String[] args) {
		div sc = new div();
		int product = sc.mulNumbers(5, 3);
        System.out.println("Product:" + product);
        int division = sc.divNumbers(7, 2);
        System.out.println("Division:" + division);
	}

}
