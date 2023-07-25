package javaclass;

import java.util.*;

public class Laddu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String laddus[] = scanner.nextLine().split(",");
        int numLaddus = laddus.length;
        int maxLaddus = numLaddus / 2;
        int[] ladduFlag = new int[100];
        int typesOfLaddus = 0;
        
        for (String laddu : laddus) {
            int type = Integer.parseInt(laddu);
            if (ladduFlag[type] == 0) {
                typesOfLaddus++;
            }
            ladduFlag[type]++;
        }
        
        int minLaddus = Math.min(typesOfLaddus, maxLaddus);
        System.out.println(minLaddus);          
    }
}
