import java.util.*;
public class  Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] pre=new int[m][2];
        List<List<Integer>> ls=new ArrayList<>();
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ls.get(b).add(a);
            indegree[a]++;
        }
        Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()>0){
            int curr=q.poll();
            ans.add(curr);
            for(int ele:ls.get(curr)){
                indegree[ele]--;
                 if(indegree[ele]==0) q.add(ele);
            }
        }
        if(ans.size()==n) System.out.print("Yes");
        else System.out.print("No");
    }
    
}