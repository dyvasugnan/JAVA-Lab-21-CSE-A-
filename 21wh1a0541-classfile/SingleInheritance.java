package javaprograms;
class One {
     int id;
     One(int id) {
        this.id = id;
    }
    void display() {
        System.out.println(" id from base_class(One): " + id);
    }
}
class Two extends One {
     String name;

    public Two(int id, String name) {
        super(id);
        this.name = name;
    }
    public void display() {
        super.display();
        System.out.println("Name from subclass(Two): " + name);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Two t = new Two(541, "Nithisha");
        t.display();
    }
}
