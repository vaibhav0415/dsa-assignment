import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int sudo[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                sudo[i][j]=sc.nextInt();
            }
        }
        solution(sudo,0,0);
        

    
    }
    public static void solution(int[][] sudo,int row,int col){
        if(col==sudo.length){
            row+=1;
            col=0;
            
        }
        if(row==sudo.length){
            display(sudo);
            return;
        }
        if(sudo[row][col]!=0){
            solution(sudo,row,col+1);
        }else{
            for(int i=1;i<=sudo.length;i++){
                if(check(sudo,row,col,i)){
                      sudo[row][col]=i;
                      solution(sudo,row,col+1);
                      sudo[row][col]=0;
                }
            }
        }
    }
    public static boolean check(int[][] sudo,int row,int col,int val ){
        int r=row;
        int c=col;
        for(int i=0;i<sudo.length;i++){
            if(sudo[i][c]==val) return false;
        }
        for(int i=0;i<sudo[0].length;i++){
            if(sudo[r][i]==val) return false;
        }
        r=row-row%3;
        c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(sudo[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
      public static void display(int[][]  sudo){
          for(int i=0;i<sudo.length;i++){
              for(int j=0;j<sudo[0].length;j++){
                  System.out.print(sudo[i][j]+" ");
              }
              System.out.println();
          }
      }
}
