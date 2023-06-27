package java21541;
class Student {
    String name;
    int age;
    int rollno;
    Student() {
        this.name = "nithisha";
        this.age = 19;
        this.rollno = 541;
    }
     void display() {
        System.out.println("name"+ name + "\nage:"+ age+ "\nrollno:" + rollno);
    }
    public static void main(String[] args) {
        Student ds = new Student();
        ds.display();
    }
}
