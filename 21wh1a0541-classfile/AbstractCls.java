package javaprograms;

abstract class MathCal {
     abstract void calculate(int x);
}
class Squaring extends MathCal {
    void calculate(int x) {
        System.out.println(x*x);
    }
}
class Cubing extends MathCal {  
    void calculate(int x) {
        System.out.println(x*x*x);
    }
}
class SqRoot extends MathCal {
    void calculate(int x) {
        System.out.println(Math.sqrt(x));
    }
    }
public class  AbstractCls{
    public static void main(String[] args) {
    	Squaring s = new Squaring();
    	s.calculate(4);
    	Cubing c = new Cubing();
    	c.calculate(4);
    	SqRoot sr = new SqRoot();
    	sr.calculate(4);
    	
    }
}
