package labclass;
import java.util.*;
import java.io.*;
public class PizzaCrust {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int r=sc.nextInt();
	int c=sc.nextInt();
	float p_area=r*r;
	float c_area=(r-c)*(r-c);
	float res=(c_area/p_area)*100.0f;
	System.out.print(res);
}
}
