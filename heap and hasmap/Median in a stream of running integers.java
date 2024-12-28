import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in );
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            int m=sc.nextInt();
            s--;
            System.out.print(m+" ");
            PriorityQueue<Integer> right=new PriorityQueue<>();//minheap
            PriorityQueue<Integer> left=new PriorityQueue<>(Comparator.reverseOrder());//maxheap
            left.add(m);
            while(s-->0){
                int num=sc.nextInt();
                if(left.size()==0 || left.peek()>num){
                    left.add(num);
                }
                else{
                    right.add(num);
                }
                if(left.size()>right.size()+1){
                    right.add(left.poll());
                }
                if(right.size()>left.size()+1){
                    left.add(right.poll());
                }
                 if(left.size()==right.size())  System.out.print((left.peek()+right.peek())/2 +" ");
                 else  if(left.size()>right.size())  System.out.print(left.peek()+" ");
                 else System.out.print(right.peek()+" ");

            }
               System.out.println();
        }
       
    
    }
}