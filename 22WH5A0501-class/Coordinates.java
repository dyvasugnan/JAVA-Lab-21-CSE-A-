import java.util.*;
class Coordinates {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            Map<String,String> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                String name=sc.next();
                long lat=sc.nextLong();
                long lon=sc.nextLong();
                String keys=lat+" "+lon;
                hm.put(keys,name);
            }
            for(int i=0;i<q;i++){
                long la=sc.nextLong();
                long lo=sc.nextLong();
                String s=la+" "+lo;
                if(hm.containsKey(s)){
                    System.out.println(hm.get(s));
                }else
                    System.out.println(-1);
            }
            System.out.println();
        }
        sc.close();
    }
}