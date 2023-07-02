package studyjava;
import java.util.Scanner;


public class Gapfull {
static int fristdigit(int n) {
	int digits = (int)(Math.log(n)/Math.log(10));
	n = (int)(n/Math.pow(10, digits));
	return n;
}
static int lastdigit(int n) {
	return (n % 10);
}
static boolean isGapful(int n) {
	int frist_dig = fristdigit(n);
	int last_dig = lastdigit(n);
	int con = frist_dig *10+last_dig;
	return (n% con ==0);
	
	
}
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if (isGapful(num))
		System.out.print("yes");
	else
		System.out.print("No");
	
}
}
