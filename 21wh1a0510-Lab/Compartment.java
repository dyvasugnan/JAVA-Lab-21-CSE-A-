Import java.lang.*;
import java.util.*;
public class Compartment {
public static void main(String[] args) {
Scanner scanner = new Scanner (System. in);
int N = scanner.nextInt();
int [] compartments = new int[N];
for (int i = 0; i < N; i++) {
compartments [i] = scanner.nextInt();
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
