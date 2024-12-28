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
        int res=perimeter(grid);
        System.out.println(res);
    }
    public static int perimeter(int[][] grid){
          int per=0;
          for(int i=0;i<grid.length;i++){
              for(int j=0;j<grid[0].length;j++){
                  if(grid[i][j]==1){
                    if (i == 0 || grid[i - 1][j] == 0) per++; 
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) per++; 
                    if (j == 0 || grid[i][j - 1] == 0) per++; 
                    if (j == grid[0].length- 1 || grid[i][j + 1] == 0) per++; 
                  }
              }
          }
          return per;
    }
}