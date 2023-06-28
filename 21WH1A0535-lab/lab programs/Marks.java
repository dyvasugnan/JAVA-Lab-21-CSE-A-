//Maximum Student Marks
import java.util.*;
public class Marks {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long mar[] = new long[n];
long a[] = new long[n];
for(int i=0;i<n;i++)
mar[i] = sc.nextLong();
for(int j=0;j<n;j++) {
long count=0;
for(int k=0;k<n;k++) {
if(k!=j) {
if(mar[j]==mar[k])
count++;
}
}
if(count==0)
a[j] = mar[j];
}
long max = a[0];
for(int t=1;t<n;t++) {
if(a[t]>max)
max = a[t];
}
System.out.println(max);

}

}

