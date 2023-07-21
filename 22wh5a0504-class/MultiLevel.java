//import java.util.*;
class GrandFather
{
    int prop;
    void getGprop(int prop)
    {
        this.prop = prop;
    }
}
class Father extends GrandFather
{
    int fprop;
    void getFprop(int fprop)
    {
        this.fprop = fprop;
    }
}
class Child1 extends Father
{
    int cprop;
    void getCprop(int cprop)
    {
        this.cprop = cprop;
    }
    void totalProp()
    {
        System.out.println("Total property: " + (prop + fprop + cprop));
    }
}
class MultiLevel
{
    public static void main(String[] args) {
        //GrandFather g = new GrandFather();
        //Father f = new Father();
        Child1 c = new Child1();
        c.getGprop(1000);
        c.getFprop(5000);
        c.getCprop(50000);
        c.totalProp();
    }
}