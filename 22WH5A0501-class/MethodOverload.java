class Addition{
    public int adding(int x,int y){
        return (x+y);
    }
    public int adding(int x,int y,int z){
        return (x+y+z);
    }
    public float adding(float x,float y){
        return (x+y);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Addition add=new Addition();
        System.out.println(add.adding(10,20));
        System.out.println(add.adding(2,5,6));
        System.out.println(add.adding(3.1f,4.5f));
    }
}
