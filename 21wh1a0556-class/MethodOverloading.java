class Add{
    public int add(int x,int y){
        return (x+y);
    }
    public int add(int x,int y,int z){
        return (x+y+z);
    }
    public double add(double x,double y){
        return (x+y);
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(20,40));
        System.out.println(a.add(20,40,80));
        System.out.println(a.add(20.6,80.4));
    }
}
