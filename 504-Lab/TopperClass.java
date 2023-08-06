package moulikaLab;

import java.util.*;


public class TopperClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int t = sc.nextInt();
		int a[] = new int[t];
		for(int i=0; i<t; i++) {
			a[i] = sc.nextInt();
		}
		int freq[] = new int[t];
		int c;
		for(int i=0; i<t; i++) {
			c=1;
			for(int j=i+1; j<t; j++) {
				if(a[i]==a[j]) {
					c++;
					freq[i] = c;
					freq[j] = c;
				}
			}
		}
		int size =0;
		for(int i=0; i<t; i++) {
			if(freq[i]==0) {
				size++;
			}
		}
		int r[] = new int[size];
		for(int i=0; i<t; i++) {
			if(freq[i]==0) {
				for(int j=0; j<size; j++) {
					r[j]=a[i];
				}
			}
		}
		int max = -1; 
        for (int i = 0; i < size; i++) {
            if (r[i] > max) {
                max = r[i];
            }
        }
		if(max>0) {
			System.out.println("Topper Student Marks: "+max);
		}
		else {
			System.out.println("-1");
		}
	}
}
