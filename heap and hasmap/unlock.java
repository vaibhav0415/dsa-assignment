import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        long k=sc.nextLong();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
              map.put(arr[i],i);
        }
        for(int i=0;i<size && k>0;i++){
            if(arr[i]==size-i) continue;
            int temp=map.get(size-i);
            map.put(size-i,arr[i]);
            map.put(arr[i],temp);
            int t=arr[i]; 
            arr[i]=arr[temp];
            arr[temp]=t;

            k--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}