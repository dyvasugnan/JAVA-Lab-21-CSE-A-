abstract class Abc{
    abstract void m1();
    void m2(){
        System.out.println("inside m2 of class abc");
    }
}
class Xyz extends Abc{
    void m1(){
        System.out.println("inside m1 of class xyz");
    }
}
class Abstract {
    public static void main(String[] args) {
        Xyz ob=new Xyz();
        ob.m1();
        ob.m2();
    }
}
