interface Father{
    int h=10;
    void calh();
}
interface Mother{
    int h=6;
    void calh();
}
class Child implements Father,Mother{
    int h;
    public void calh(){
        h=(Father.h+Mother.h)/2;
        System.out.println(h);
    }
}
public class InterfaceMultiple {
    public static void main(String[] args) {
        Child c=new Child();
        c.calh();
    }
}
