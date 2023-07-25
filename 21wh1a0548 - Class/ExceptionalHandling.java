class ExceptionEx{
public static void main(String args[]){
java.util.Scanner s=
new java.util.Scanner(System.in);
System.out.println("Enter 2 numbers ");
int x=s.nextInt();
int y=s.nextInt();
try{
int z=x/y;
System.out.println("Result is : "+z);
}
catch(ArithmeticException a)
{

System.out.println("Invalid");
System.out.println("Enter 2nd value ");

y=s.nextInt();
int z=x/y;
System.out.println("Result is : "+z);
}
}
}