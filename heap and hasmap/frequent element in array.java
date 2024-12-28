import java.util.*;

class Pair {
    int num;
    int count;

    Pair(int num, int count) {
        this.num = num;
        this.count = count;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  
        int k = sc.nextInt();     

        Map<Integer, Integer> map = new TreeMap<>();
        
    
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

      
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            public int compare(Pair a, Pair b) {
                return b.count - a.count; 
            }
        });
        for (int nums : map.keySet()) {
            Pair pair= new Pair(nums, map.get(nums));
            pq.add(pair);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (k-->0 && pq.size()>0) {
            ans.add(pq.poll().num);
        }
        Collections.sort(ans);
         
        for (int nums: ans) {
            System.out.print(nums+ " ");
        }
    }
}
