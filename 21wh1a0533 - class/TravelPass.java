package javaclass;
import java.util.*;
public class TravelPass {
	public static void main (String[] args) throws java.lang.Exception{
		// TODO Auto-generated constructor stub
		// your code goes here
			Scanner in = new Scanner(System.in);
			int T =in.nextInt();
			while(T>0){
				    T--;
				    int N =in.nextInt();
				    int A =in.nextInt();
				    int B =in.nextInt();
				    in.nextLine();
				    String S= in.nextLine();
				    char[] ch = S.toCharArray();
				    int res=0;
				    for(int i=0;i<N;i++){
				      //  System.out.println("value is"+ch[i]);
				        if(ch[i]=='0'){
				            res=res+A;
				        }
				        else{
				            res=res+B;
				        }
				      //  System.out.println(res);
				    }
				    System.out.println(res);
				    
				}
			}
		}

