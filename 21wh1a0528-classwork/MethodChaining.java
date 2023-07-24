class Student{
    int a,b;
    Student setData(int x,int y){
        a = x;
        b = y;
    return this;
    }
    Student getData(){
        System.out.println("a = "+a+" b = "+b);
        return this;
    }
}
class MethodChaining{
    public static void main(String args[]){
     Student s= new Student();
     s.setData(10,11).getData().setData(20,22).getData();
    // s.setData(10,11).setData(20,22).getData().getData();
    }
}