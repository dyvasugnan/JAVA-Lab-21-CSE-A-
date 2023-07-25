class Test
{
void method1() 
{ System.out.println("Mtd-1"); }
void method1(int x) 
{System.out.println("Mtd-1 with arg "+x); }
void method1(int x,int y)
{ System.out.println("Mtd-1 with 2 args "+x+y); }
public static void main(String args[ ])
{
Test t=new Test( );
t.method1(10);
t.method1( );
t.method1(10,20);
