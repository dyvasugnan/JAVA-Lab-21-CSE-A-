
class A
{
    int a;
}
class B extends A
{
    int b;
    B()
    {
        a=5;
        b=10;
    }
    void sum()
    {
        System.out.print("Sum is "+(a+b));
    }
}
class Single
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.sum();
    }
}