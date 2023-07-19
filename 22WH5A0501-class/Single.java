//single level inheritance
class Base{
    int x,y;
    void getData(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Derived extends Base{
    void perform(){
        int z=x+y;
        System.out.println(z);
    }
}
class Single{
    public static void main(String args[]){
        Derived d=new Derived();
        d.getData(10,20);
        d.perform();
    }
}