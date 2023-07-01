package javaclass;
import java.util.*;
public class Compartment {
	 public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		        Scanner sc = new Scanner(System.in);
		        int numCmpts = sc.nextInt();

		        int[] compartments = new int[numCmpts];
		        for (int i = 0; i < numCmpts; i++) {
		            compartments[i] = sc.nextInt();
		        }

		        Arrays.sort(compartments);

		        int maxLength = 1;
		        int currentLength = 1;
		        for (int i = 1; i < numCmpts; i++) {
		            if (compartments[i] == compartments[i - 1] + 1) {
		                currentLength++;
		            } else {
		                currentLength = 1;
		            }
		            maxLength = Math.max(maxLength, currentLength);
		        }

		        System.out.println(maxLength);
		    }
		}



