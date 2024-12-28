import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      Long n=sc.nextLong();
      Long k=sc.nextLong();
      PriorityQueue<Long> pq=new PriorityQueue<>(Comparator.reverseOrder());
      for(int i=0;i<n;i++){
          int a=sc.nextInt();

          if(a==1){
                Long x=sc.nextLong();
                Long y=sc.nextLong();
                Long d=x*x + y*y;
               
                    pq.add(d);
            
                 if(pq.size()>k)
                    pq.poll();
                  
                

          }
          else if(a==2){
              System.out.println(pq.peek());
          }
      }
    }
}