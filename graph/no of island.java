import java.util.*;

public class  Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        char[][] grid = new char[m][n];
        scanner.nextLine();  
        for (int i = 0; i < m; i++) {
            String row = scanner.nextLine();
            grid[i] = row.toCharArray();
        }
       int result= numsIsland(grid);
       System.out.println(result);
    }
    public static int numsIsland(char[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        int cc=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]=='0'){
                    continue;
                }
                if(grid[r][c]=='2'){
                    //visited land
                    continue;
            }
            cc++;
            grid[r][c]='2';
            Queue<int[]> q=new LinkedList<>();
            q.add(new int[]{r,c});
            while(q.size()>0){
                  int[] curr=q.poll();
                  int crow=curr[0];
                  int ccol=curr[1];
                  if(crow-1>=0 && grid[crow-1][ccol]=='1'){
                      q.add(new int[]{crow-1,ccol});
                      grid[crow-1][ccol]='2';
                  }
                   if(crow+1<row && grid[crow+1][ccol]=='1'){
                      q.add(new int[]{crow+1,ccol});
                      grid[crow+1][ccol]='2';
                  }
                   if(ccol-1>=0 && grid[crow][ccol-1]=='1'){
                      q.add(new int[]{crow,ccol-1});
                      grid[crow][ccol-1]='2';
                  }
                   if(ccol+1<col && grid[crow][ccol+1]=='1'){
                      q.add(new int[]{crow,ccol+1});
                      grid[crow][ccol+1]='2';
                  }

            }
        }
    }
    
    return cc;
}

}