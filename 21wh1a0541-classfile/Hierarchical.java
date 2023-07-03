package javaprograms;
class Parentcls {
    int id;
    Parentcls(int id) {
        this.id = id;
    }
     void display() {
        System.out.println("from parent class id :" + id);
    }
}
class Childcls1 extends Parentcls {
     String name;
    Childcls1(int id, String name) {
        super(id);
        this.name = name;
    }
     void display() {
        super.display();
        System.out.println("from child class1 name:" + name);
    }
}
class Childcls2 extends Parentcls {
     int age;
    Childcls2(int id,int age) {
        super(id);
        this.age = age;
    }
     void display() {
        super.display();
        System.out.println("from child class2 age  " + age);
    }
}
 class Hierarchical {
    public static void main(String[] args) {
    	Childcls1 c1 = new Childcls1(541, "Nithisha");
        c1.display();
        Childcls2 c2 = new Childcls2(541,19);
        c2.display();
    }
}
