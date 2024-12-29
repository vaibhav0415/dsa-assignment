import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long[] arey=new long[a];
        for(int i=0;i<a;i++){
            arey[i]=sc.nextInt();
        }
        long target=sc.nextInt();
        Arrays.sort(arey);
        long start=0;
        long end=arey[arey.length-1];
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(check(arey,mid,target)){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
     public static boolean check(long[] arr,long mid,long target){
         long total=0;
         for(long j:arr){
             if(j>=mid){
                 total+=j-mid;
             }
             if(total>=target){
                 return true;
             }
            
         }
         return false;

     }
}