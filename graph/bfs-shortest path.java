import java.util.*;

public class Main{
    public static int[] bfs(int n, ArrayList<ArrayList<int[]>> adj, int src) {

        int[] distances = new int[n + 1];
        Arrays.fill(distances, 1000005);
        distances[src] = 0; 
        

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0}); 
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];
            
           
            if (dist > distances[node]) {
                continue;
            }
            for (int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0];
                int weight = neighbor[1];
                int newdist = dist + weight;
                
               
                if (newdist < distances[adjNode]) {
                    distances[adjNode] = newdist;
                    pq.offer(new int[]{adjNode, newdist});
                }
            }
        }
           return distances;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int q=sc.nextInt();
         while(q-->0){
             int n=sc.nextInt();
             int e=sc.nextInt();
                ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
                for(int i=0;i<=n;i++){
                    adj.add(new ArrayList<>());
                }
                for(int i=0;i<e;i++){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    adj.get(a).add(new int[]{b,6});
                    adj.get(b).add(new int[]{a,6});
                }
               int src=sc.nextInt();
               int[] distance=bfs(n,adj,src);
               for(int i=1;i<=n;i++){
                   if(i==src) continue;
                   if(distance[i]==1000005) System.out.print("-1 ");
                    else  System.out.print(distance[i]+" ");
               }
               System.out.println();
         }
    }
}
