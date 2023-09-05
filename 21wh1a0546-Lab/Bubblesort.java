/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Bubblesort
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int count = 0;
System.out.print("Enter the number of elements : ");
int n = sc.nextInt();
System.out.println("Enter the elements of the array");
int a[] = new int[n];
for(int i = 0; i< n; i++){
   a[i] = sc.nextInt();
}
System.out.println("Before bubble sort : ");
for(int i = 0; i< n; i++){
   System.out.print(a[i]+" ");
}
System.out.println(" After bubble sort : ");
for(int i = 0 ; i < n - 1 ; i++){
   for(int j = 0 ; j < n - i - 1 ; j ++){
       if(a[j] > a[j + 1]){
           int temp = a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
           count += 1;
       }
       
   }
}
for(int i = 0; i< n; i++){
   System.out.print(a[i]+" ");
}
System.out.println("Number of swaps = "+count);
}
}
