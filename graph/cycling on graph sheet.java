import java.util.*;
public class Main {
    static int find(int[] parent,int x){
        return parent[x]=(parent[x]==x)? x: find(parent,parent[x]);
    }
    static boolean Union(int[] parent,int[] rank,int a,int b){
        a=find(parent,a);
        b=find(parent,b);
        if(a==b) return true;
        if(rank[a]>=rank[b]){
            rank[a]++;
            parent[b]=a;
        }
        else{
            rank[b]++;
            parent[a]=b;
        }
        return false;
    }
    public static void main (String args[]) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int m=sc.nextInt();
           int[] parent=new int[n+1];
           int[] rank=new int[n+1];
           for(int i=0;i<=n;i++){
               parent[i]=i;
           }
           boolean b=false;
           while(m-->0){
               int x=sc.nextInt();
               int y=sc.nextInt();
               b=Union(parent,rank,x,y);
               if(b==true) {
                   System.out.print("1");
                   return;
                   }
           }
           if(b==false) System.out.print("0");
         
    }
}