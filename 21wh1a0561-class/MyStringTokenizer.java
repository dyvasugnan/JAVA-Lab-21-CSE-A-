package javalab;
import java.util.*;
public class MyStringTokenizer {
	public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Welcome to core java programming");
        System.out.println("no.of Tokens : " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println("next token : "+ st.nextToken());
        }
    }
}
