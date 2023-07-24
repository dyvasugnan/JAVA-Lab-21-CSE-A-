package javalab;
class Box { 
Box() { 
 System.out.println("Box() in super class"); 
 } 
Box(int a){ 
 System.out.println("Box(int a) in super class");
 } 
} 
class BoxWeight extends Box { 
 BoxWeight(){ 
 super(10); 
 System.out.println("BoxWeight() in sub class");
} 
} 
class Super{ 
 public static void main(String args[]) { 
 BoxWeight mybox1 = new BoxWeight(); 
 } 
}
