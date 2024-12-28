import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(size-->0){
            nums[i]=sc.nextInt();
            i++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();//minheap
        for(i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}