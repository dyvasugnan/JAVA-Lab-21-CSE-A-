package javaprograms;

interface Father {
    double fh = 5.5;
    void details();
}
interface Mother {
    double mh = 5.3;
    void details();
}
class Child implements Father, Mother {
    public void details() {
        System.out.println("Father's height: " + Father.fh);
        System.out.println("Mother's height: " + Mother.mh);
    }
}
public class Inheritanceheightmulti {
    public static void main(String[] args) {
        Child c = new Child();
        c.details();
    }
}
