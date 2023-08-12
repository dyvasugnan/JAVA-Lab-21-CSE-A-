package moulikaLab;
import java.util.*;
class Sub{
	int n1;
	int n2;
	Sub(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	void swap(Sub s) {
		int temp = s.n1;
		s.n1 = s.n2;
		s.n2 = temp;
	}	
}
public class Swap2nos {
	public static void main(String [] args) {		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Sub s = new Sub(n1, n2);
		System.out.println("n1: "+s.n1+"n2: "+s.n2);
		s.swap(s);
		System.out.println("n1: "+s.n1+"n2: "+s.n2);
		
	}
}
