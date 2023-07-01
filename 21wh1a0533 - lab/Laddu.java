package javaclass;
import java.util.*;
public class Laddu {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		        Scanner sc = new Scanner(System.in);
		        String l[] = sc.nextLine().split(",");
		        int n = l.length;
		        int maxl = n / 2;
		        int[] flag = new int[100];
		        int types = 0;
		        for (String laddu : l) {
		            int type = Integer.parseInt(laddu);
		            if (flag[type] == 0) {
		                types++;
		            }
		            flag[type]++;
		        }
		        int minl = Math.min(types, maxl);
		        System.out.println(minl);          
	}

}
