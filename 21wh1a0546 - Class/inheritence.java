/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Three{
    int getx(int x){
        return x;
    }
}
class Two{
    Three obj3;
    Two(Three obj3){
        this.obj3 = obj3;
    }
    int Square(int x){
        int result = x * obj3.getx(x);
        return result;
    }
}
class One{
    Two obj2;
    One(Two obj2){
        this.obj2 = obj2;
    }
    int cube(int x){
        int result = x * obj2.Square(x);
        return result;
    }
}
class Main{
    public static void main(String[] args){
        Three t = new Three();
        Two two = new Two(t);
        One one = new One(two);

        int r1 = one.cube(6);
        System.out.println("Cube: " + r1);
    }
}
