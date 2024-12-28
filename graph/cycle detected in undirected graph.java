import java.util.*;

public class Main {

  
    public static boolean isCycle(boolean[] visited, List<List<Integer>> ls, int src) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, -1}); 
        visited[src] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int parent = curr[1];

            for (int adjacent : ls.get(node)) {
               
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    q.add(new int[]{adjacent, node});
                }   
                else if (adjacent != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();  
            int m = sc.nextInt(); 
            List<List<Integer>> ls = new ArrayList<>(n + 1);

 
            for (int i = 0; i <= n; i++) {
                ls.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                ls.get(u).add(v);
                ls.get(v).add(u);
            }

            boolean[] visited = new boolean[n + 1];
            boolean cycle = false;

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    if (isCycle(visited, ls, i)) {
                        System.out.println("yes");
                        cycle = true;
                        break;
                    }
                }
            }

            if (!cycle) {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
