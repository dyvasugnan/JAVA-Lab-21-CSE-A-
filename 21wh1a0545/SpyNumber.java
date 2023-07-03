import java.lang.*;
import java.util.*;
class Spynumber{
public static void main(String args[]){
int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int sum = 0;
int product = 1;
while(n > 0){
int rem = n % 10;
sum += rem;
product *= rem;
n  = n / 10;
}
if(sum == product){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}