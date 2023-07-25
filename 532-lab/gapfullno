import java.lang.*;
import java.util.*;
class GapFul{
public static void main(String args[]){
  Scanner n = new Scanner(System.in);
  System.out.print("Number is : ");
  int num = n.nextInt();
  int count=0;
  int temp=num;
  while(num!=0){
  num=num/10;
  count++;
  }
  if(count>=3){
  int l = (int)(temp % Math.pow(10,1));
  int f =(int)(temp / Math.pow(10,count-1));
  int n3 = (f*10)+l;
  if(temp % n3 == 0)
  System.out.println("Gapfull Number");
  else
  System.out.println("Not gapfull");
  }
  else{
  System.out.println("Not gapfull");
  }
 }
}
