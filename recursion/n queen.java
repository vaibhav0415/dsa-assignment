import java.util.*;
public class Main {
    static int c=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[][]=new int[a][a];
        queen(arr,a,0);
        System.out.println();
        System.out.println(c);
    }
    public static void queen(int[][] arr,int total,int row){
        if(total==0){
            c++;
            display(arr);
            return;
        }
        if(row==arr.length) return;
        for(int j=0;j<arr.length;j++){
            if(check(arr,row,j)){
                arr[row][j]=1;
            
            queen(arr,total-1,row+1);
               arr[row][j]=0;
            }
        }

    }
    public static boolean check(int[][] arr,int row,int col){
         int r=row;
         int c=col;
         while(r>=0){
             if(arr[r][col]==1) return false;
             r--;
         }
         r=row;
         c=col;
         while(r>=0 && c<arr[0].length){
             if(arr[r][c]==1) return false;
             r--;
             c++;
         }
         r=row;
         c=col;
         while(r>=0 && c>=0){
             if(arr[r][c]==1) return false;
             r--;
             c--;
         }
         return true;
    }
    public static void display(int [][] board){
         for(int i=0;i<board.length;i++){
             for(int j=0;j<board[0].length;j++){
                  if(board[i][j]==1){
                      System.out.print("{"+(i+1)+"-"+(j+1)+"}");
                  }
             }
             System.out.print(" ");
         }
         System.out.print(" ");
         
    }
}
