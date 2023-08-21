package javalab;

import java.util.Scanner;

public class QuickSort {

public static void quicksort(int a[],int low,int high) {

if(low<high) {

int j = partition(a,low,high);

quicksort(a,low,j-1);

quicksort(a,j+1,high);

}

}

public static int partition(int a[],int low,int high) {

int p = a[low];

int i = low + 1;

int j = high;

while(i<=j) {

while(a[i]<p && i<=j) {

i++;

}

while(a[j]>p && i<=j) {

j--;

}

if(i<j) {

int t = a[i];

a[i]=a[j];

a[j]=t;

}

}

a[low]=a[j];

a[j]=p;

return j;

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter size:");

int n = sc.nextInt();

int [] a = new int[n];

System.out.println("Enter array elements:");

for(int i=0;i<n;i++) {

a[i]=sc.nextInt();

}

System.out.println("Before sort:");

for(int i=0;i<n;i++) {

System.out.print(a[i]+ " ");

}

quicksort(a,0,n-1);

System.out.println();

System.out.println("After sort:");

for(int i=0;i<n;i++) {

System.out.print(a[i]+ " ");

}

}

}

