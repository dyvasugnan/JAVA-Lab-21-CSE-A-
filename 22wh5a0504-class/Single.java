class Parent
{
    int age;
    void getData(int age)
    {
        this.age = age;
    }
    
}

class Child extends Parent{
    int age;
    void print()
    {
        age = super.age;
        System.out.println(age);
    }
    
}

class Single
{
    public static void main(String agrs[])
    {
        Child c = new Child();
        c.getData(19);
        c.print();
    }
}