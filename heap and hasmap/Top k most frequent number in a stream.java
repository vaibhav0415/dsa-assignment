import java.util.*;
class Pair {
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
        
    }
class comparator implements Comparator<Pair>{
    public int compare(Pair a, Pair b) {
        if (a.freq == b.freq) {
            return a.num - b.num;
        }
     
        return b.freq - a.freq; 
}

}
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
                int size=sc.nextInt();
                int k=sc.nextInt();
                Map<Integer,Integer> map=new TreeMap<>();
                PriorityQueue<Pair> pq=new PriorityQueue<>(new comparator());
                while(size-- >0){
                    int a=sc.nextInt();
                    map.put(a,map.getOrDefault(a,1)+1);
                    pq.clear();
                    for(int key:map.keySet()){
                        pq.add(new Pair(key,map.get(key)));
                    }
                    List<Integer> ar=new ArrayList<>();
                    int count=0;
                    while(pq.size()>0 && count<k){
                        ar.add(pq.poll().num);
                        count++;
                    }
                    for(int num:ar){
                        System.out.print(num+" ");
                    }
                }
                System.out.println();
        }
    }
}