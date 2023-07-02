class A{
    int a,b;
    void getData(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class B extends A{
    void add(){
        int x=a+b;
        System.out.println("add = "+x);
    }
}
class C extends B{
    void div(){
        int y=a/b;
        System.out.println("div = "+y);
    }
}
class D extends B{
    void mod(){
        int z=a%b;
        System.out.println("mod = "+z);
    }
}
class Hybrid{
    public static void main(String args[]){
        C c=new C();
        c.getData(10,2);
        c.add();
        c.div();
        D d=new D();
        d.getData(15,4);
        d.add();
        d.mod();
    }
}