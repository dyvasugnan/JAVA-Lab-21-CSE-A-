abstract class Shape {
    abstract void calculate(double x);
}

class Square extends Shape {
    @Override
    void calculate(double x) {
        System.out.println(x * x);
    }
}

class Cube extends Shape {
    @Override
    void calculate(double x) {
        System.out.println(x * x * x);
    }
}

class SquareRoot extends Shape {
    @Override
    void calculate(double x) {
        System.out.println(Math.sqrt(x));
    }
}

class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.calculate(2.5);

        Cube c = new Cube();
        c.calculate(2.5);

        SquareRoot s = new SquareRoot();
        s.calculate(2.5);
    }
}
