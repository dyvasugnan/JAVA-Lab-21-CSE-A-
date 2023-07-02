class A{
    int a,b;
    void getData(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class B extends A{
    void addition(){
        int add=a+b;
        System.out.println("addition = "+add);
    }
}
class C extends A{
    void multiplication(){
        int mul=a*b;
        System.out.println("Multiplication = "+mul);
    }
}
class Hierarchical{
    public static void main(String args[]){
        B b=new B();
        C c=new C();
        b.getData(10,5);
        b.addition();
        c.getData(5,2);
        c.multiplication();
    }
}