class One
{
    int a;
}
class Two extends One
{
    int b;
}
class Three extends Two
{
    int c;
    Three()
    {
        a=10;
        b=5;
        c=3;
    }
    void mul()
    {
        System.out.print("Multiplication is "+(a*b*c));
    }
}
class MultiLevel
{
    public static void main(String args[])
    {
        Three obj=new Three();
        obj.mul();
    }

}

