package studyjava;
class HydridInheritance {
}
class Earth extends HydridInheritance{
}
class Mars extends HydridInheritance{
}
public class Moon extends Earth {
    public static void main(String args[])
    {
    	HydridInheritance s = new HydridInheritance();
        Earth e = new Earth();
        Mars m = new Mars);
  
        System.out.println(s instanceof HydridInheritance);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof HydridInheritance);
    }
}