interface Father {
    int ht = 6;
    void calculate();
}

interface Mother {
    int ht = 5;
    void calculate();
}

class Child implements Father, Mother {
    int ht;
    public void calculate() {
        ht = (Father.ht + Mother.ht) / 2; 
        System.out.println(ht);
    }
}

class Interface {
    public static void main(String[] args) {
        Child child = new Child();
        child.calculate(); 
    }
}