import java.util.*;
import java.lang.*;
class Student{
public static void main(String args[]){
System.out.println("Enter no of students:");
int maxi = 0;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]  = new int[n];
String name[] = new String[n];
double score[] = new double[n];
for(int i = 0; i < n; i++){
System.out.println("Enter Student Details:");
name[i] = sc.next();
arr[i] = sc.nextInt();
maxi= Math.max(maxi, arr[i]);
score[i] = sc.nextDouble();
}
System.out.println( "highest marks :" + maxi);
}
}

