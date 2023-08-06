package java_lab;
import java.util.*;
public class CopyTest {
	public static void main(String[] args) {
        int a[]=new int[]{1,2,3,1,2,3,4,4,5};
        int ct[]=new int[a.length];
        int visited=-1;
        int ans=-1;
        int maxi=-1;
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    ct[j]=visited;
                }
            }
            if(ct[i]!=visited)
            ct[i]=count;
        }
        for(int i=0;i<ct.length;i++){
            if(ct[i]==1)
            maxi=Math.max(maxi,a[i]);
        }
        System.out.println(maxi);
    }
}

