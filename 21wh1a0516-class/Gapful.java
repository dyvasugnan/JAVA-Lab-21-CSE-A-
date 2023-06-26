import java.util.*;
import java.lang.*;

public class Gapful {
	public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			int num = sc.nextInt();
			int ld = num%10;
			String s = String.valueOf(num);
			int len = s.length()-1;
			double len1 = len;

			System.out.println("ld "+ld+"leng "+len);
			
			double div_num = Math.pow(10,len1);
			// System.out.println(/div_num);
			int fi = (int)div_num;

			int fd = num/fi;
			System.out.println(fd); 

	}



}
