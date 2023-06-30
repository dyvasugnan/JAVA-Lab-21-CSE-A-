
class C
{
    int a;
}
class D extends C
{
    int b;
    D()
    {
        a=5;
        b=10;
    }
    void sum()
    {
        System.out.print("Sum is"+(a+b));
    }
}
class E extends C
{
    int c;
    E()
    {
        a=10;
        c=3;
    }
    void mul()
    {
        System.out.print("Multiplication is "+(a*c));
    }
}
class Hierarchical
{
    public static void main(String args[])
    {
        D obj1=new D();
        obj1.sum();
        E obj2=new E();
        obj2.mul();
    }
   
}

