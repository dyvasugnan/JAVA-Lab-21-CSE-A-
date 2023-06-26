import java.lang.*;
import java.util.*;
class Cricket{
public static void main(String args[]){
int test, odi, mofm, india, ipl;
int amount;
Scanner sc = new Scanner(System.in);
System.out.println("enter the no of test matches:");
test = sc.nextInt();
System.out.println("enter the no of odi matches:");
odi = sc.nextInt();
System.out.println("enter 1 if played of india else 0");
india = sc.nextInt();
System.out.println("enter no of man of the match");
mofm = sc.nextInt();
System.out.println("enter 1 if played in ipl else 0");
ipl = sc.nextInt();

if(odi >= 100 && test >= 10){
amount = 50000;
}
else if(test >= 10){
amount = 25000;
}
else if(odi >= 100){
amount = 15000;
}
else if(india == 1){
amount = 10000;
}
else if(india == 0 && ipl == 1){
amount = 8000;
}
else{
amount = 7000;
}

for(int i = 0; i < mofm; i++){
amount += amount / 4;
}
System.out.println("amount :" + amount);
}
}





