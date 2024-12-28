import java.util.*;
public class Main {
    private static HashMap<Integer,HashSet<Integer>> graph;
    private static void createGraph(int n,int[][] edges){
        graph=new HashMap<>();
        for(int i=1;i<=n;i++){
            graph.put(i,new HashSet<>());
        }
        for(int[] a:edges){
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }
    }
    private static int findBN(int s,HashSet<Integer> visited,int ans){
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> childCount = new HashMap<>();
        HashMap<Integer, Integer> parentMap = new HashMap<>();  
        q.add(s);
        visited.add(s);
        parentMap.put(s, -1);
        while (!q.isEmpty()) {
            int c = q.remove();
            int children = 0;
            for (int nbr : graph.get(c)) {
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    q.add(nbr);
                    parentMap.put(nbr, c);
                    children++;
                }
            }
            childCount.put(c, children);
        }
        for (int node : parentMap.keySet()) {
            int p = parentMap.get(node);
            if (p != -1 && childCount.get(node) > childCount.get(p)) ans++;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] edges=new int[m][2];
        while(m-->0){
            int[] a=new int[2];
            a[0]=sc.nextInt();
            a[1]=sc.nextInt();
            edges[m]=a;
        }
        createGraph(n,edges);
        int ans=0;
        HashSet<Integer> visited=new HashSet<>();
        for(int i=1;i<=n;i++){
            if(!visited.contains(i)){
                ans+=findBN(i,visited,0);
            }
        }
        System.out.println(ans);
    }
}