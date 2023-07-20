import java.util.*;
public class GapFull {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        String s = sc.nextLine();
        
        int a = s.charAt(0) - '0';
        
        int n = Integer.parseInt(s);
        
        int b = n%10;
        int x = a*10+b;
        if(n % x == 0)
            System.out.println("\nIt is a gapfull number");
        else
            System.out.println("\nIt is not a gapfull number");
        }
}
