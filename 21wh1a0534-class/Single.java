package java_labcodes;
class sum {
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
class sub extends sum {
    public int subtractNumbers(int a, int b) {
        return a - b;
    }
}
public class Single {
	public static void main(String[] args) {
		sub sc = new sub();
		int sum = sc.addNumbers(5, 3);
        System.out.println("Sum" + sum);
        int difference = sc.subtractNumbers(7, 2);
        System.out.println("Difference" + difference);
	}

}
