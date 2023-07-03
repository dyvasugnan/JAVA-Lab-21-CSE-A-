package javaprograms;
class Basecls {
     int id;
    Basecls(int id) {
        this.id = id;
    }
    void display() {
        System.out.println("from base class id:" + id);
    }
}
class Subcls1 extends Basecls{
     String name;
     Subcls1(int id, String name) {
        super(id);
        this.name = name;
    }
     void display() {
        super.display();
        System.out.println("Name from subclass1 name:" + name);
    }
}
class Subcls2 extends Subcls1 {
    int age;
    Subcls2(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }
     void display() {
        super.display();
        System.out.println("from subclass2 age : " + age);
    }
}
 class Multilevel {
    public static void main(String[] args) {
        Subcls2 s = new Subcls2(541,"Nithisha",19);
        s.display();
    }
}
