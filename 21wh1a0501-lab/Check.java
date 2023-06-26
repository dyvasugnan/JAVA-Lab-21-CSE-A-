import java.lang.*;
import java.util.*;
class Check{
public static void main(String args[]){
System.out.println("Enter a number : ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 1; i <= n; i++){
for(int k = 1 ; k < i; k++){
if(i == k * (k + 1)){
System.out.print(i);
System.out.print(" ");
}
}
}
}
}

