import java.io.*;
import java.lang.*;
import java.util.*;

class StrTokeniser{
    public static void main(String args[]) throws IOException {
            
            System.out.println("Enter stud details");

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
            String str = br.readLine();

            StringTokenizer st =  new StringTokenizer(str,",");

            String name = st.nextToken().trim();

            int age = Integer.parseInt( st.nextToken().trim());

            System.out.println("Name: "+name+" | age: "+age);

        }
}


