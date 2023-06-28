//Single Inheritance
class Student{
    void salary(){
        System.out.println("Name = Priyanka");
    }
}
class Rollno extends Student{
    void bonus(){
        System.out.println("Roll Number = 535");
    }
}
class Single_Inheritance{
    public static void main(String args[]){
        Rollno r = new Rollno();
        r.salary();
        r.bonus();
    }
}