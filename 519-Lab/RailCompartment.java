package java_codes;

import java.lang.*;
import java.util.*;
public class RailCompartment {
public static void main(String[] args) {
Scanner sc = new Scanner (System. in);
int N = sc.nextInt();
int [] compartments = new int[N];
for (int i = 0; i < N; i++) {
compartments [i] = sc.nextInt();
}
Arrays.sort(compartments);
int maxLength = 1;
int currentLength = 1;
for (int i = 1; i < N; i++) {
if (compartments [i] == compartments[i-1] + 1) {
currentLength++;
}
else {
currentLength =1;
}
maxLength = Math.max(maxLength,currentLength);
}
System.out.println(maxLength);
}
}
