import java.util.*;
class SpyNumber{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int sum=0;
  int product=1;
  while(n!=0){
  n = n%10;
  sum+=n;
  product*=n;
  n=n/10;
  }
  if(sum==product){
     System.out.println("output=true");
     }
     else{
     System.out.println("output=false");
     }
    }
 }   
