public class ChotaBheem{
    public static void main(String [] args){
        int arr[]=new int[]{2,4,1,2,3,4};
        int []ct = new int[arr.length];
        int visited = -1;
        int flag=0,ans=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    ct[j] = visited;
                }
            }
            if(ct[i] != visited){
                ct[i] = count;
            }
           
        }
        for(int i=0;i<arr.length;i++){
            if(ct[i]>0){
                flag+=1;
            }
        }
        if(flag>arr.length/2){
            System.out.println(arr.length/2);
        }
        else{
            System.out.println(flag);
        }
    }
}

