import java.util.*;
public class Main {
    public static void main (String args[]) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        int maxf=0;
        int maxnum=arr[0];
        for(int nums:map.keySet()){
            int f=map.get(nums);
            if(f>maxf){
                maxf=f;
                maxnum=nums;
            }
        }
        System.out.print(maxnum);
    } 
}