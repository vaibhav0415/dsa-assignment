import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
         int[][] grid=new int[m][n];
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 grid[i][j]=sc.nextInt();
             }
         }
         int result=area(grid);
         System.out.println(result);
    }
    public static int area(int[][] grid){
        int maxarea=0;
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                   Queue<int[]> q=new LinkedList<>();
                   q.add(new int[]{i,j});
                   int max=0;
                   grid[i][j]=0;
                   while(q.size()>0){
                       int[] curr=q.poll();
                       int currRow=curr[0];
                       int currCol=curr[1];
                       max++;
                       for(int[] dir:direction){
                           int newRow=currRow+dir[0];
                           int newCol=currCol+dir[1];
                           if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1){
                               q.add(new int[]{newRow,newCol});
                               grid[newRow][newCol]=0;
                           }
                       }
                   }
                   maxarea=Math.max(maxarea,max);
               }
            }
        }
        return maxarea;
    }
}