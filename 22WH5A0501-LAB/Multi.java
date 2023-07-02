class A{
    void showA(){
        System.out.println("This is class A");
    }
}
class B extends A{
    void showB(){
        System.out.println("This is class B");
    }
}
class C extends B{
    void showC(){
        System.out.println("This is class C");
    }
}
class Multi{
    public static void main(String args[]){
        C obj=new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}