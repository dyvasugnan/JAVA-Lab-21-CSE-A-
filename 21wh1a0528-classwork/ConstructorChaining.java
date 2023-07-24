class Test{
    int a,b,c,d;
    Test(int p,int q){
        a=p;
        b=q;
    }
    Test(int p,int q,int r){
        this(p,q);
        c=r;
    }
    Test(int p,int q,int r,int s){
        this(p,q,r);
        d=s;
    }
    void display(){
        System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);
    }

}
class ConstructorChaining{
    public static void main(String args[]){
     Test t= new Test(3,4,5,6);
     t.display();
    }
}