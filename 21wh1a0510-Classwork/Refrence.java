public class Refrence {
    public static void main(String args[]) {
        Data d = new Data(20);
        Processor p = new Processor(10, d);
        p.display();
    }
}

class Data {
    int x;

    Data(int x) {
        this.x = x;
    }
}

class Processor {
    int y;
    Data d;

    Processor(int y, Data d) {
        this.y = y;
        this.d = d;
    }

    void display() {
        System.out.println("Y: " + y);
        System.out.println("X: " + d.x);
    }
}
