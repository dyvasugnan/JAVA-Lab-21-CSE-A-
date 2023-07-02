package javalab;
import java.lang.*;
import java.util.*;

public class Laddus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] laddus = sc.nextLine().split(",");
        int n = laddus.length;
        int maxLaddus = n / 2;
        int[] count = new int[100];
        int types = 0;
        for (String laddu : laddus) {
            int type = Integer.parseInt(laddu);
            if (count[type] == 0) {
                types++;
            }
            count[type]++;
        }
        if (types <= maxLaddus) {
            System.out.println(types);
        } else {
            System.out.println(maxLaddus);
        }
	}

}
