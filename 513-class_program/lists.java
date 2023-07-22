package javalab;
import java.util.ArrayList;

public class lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> food = new ArrayList<String>();
			
			food.add("Biryani");
			food.add("Chips");
			food.add("Pizza");
			
			//arrays have .length and arrayList have .size()
			
			food.set(0,"potato");
			food.remove(2);
			
			for(int i=0;i<food.size();i++) {
				System.out.println(food.get(i));
			}
			
			food.clear();
	}

}
