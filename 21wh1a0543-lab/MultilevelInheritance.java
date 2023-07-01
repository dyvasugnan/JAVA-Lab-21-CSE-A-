package javaprograms;

class First {
  int num;

  First(int num) {
     this.num = num;
 }

  void displayValue() {
     System.out.println("Value: " + num);
 }
}

class Second extends First {
  Second(int num) {
     super(num);
 }

  void displayDoubleValue() {
     System.out.println("Double value: " + (num * 2));
 }
}

class Three extends Second {
  Three(int num) {
     super(num);
 }

  void displayTripleValue() {
     System.out.println("Triple value: " + (num * 3));
 }
}

 class MultilevelInheritance {
 public static void main(String[] args) {
     Three th = new Three(5);
     th.displayValue();
     th.displayDoubleValue();
     th.displayTripleValue();
 }
}
