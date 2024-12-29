import java.util.*;
public class Main {
     static int count=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        solve(a,0,0,"");
        System.out.println();
        System.out.print(count);
    }
    public static void solve(int a,int row,int col,String ans){
        ans+="{"+row+"-"+col+"}";
        if(row>=a && col>=a){
            return;
        }
        if(row==a-1 && col==a-1){
             count++;
             System.out.print(ans+" ");
             return;
        }
        int [] r={2,1};
        int [] c={1,2};
        for(int i=0;i<c.length;i++){
            solve(a,row+r[i],col+c[i],ans+"K");
        }
        if(row==0 || col==0 ||row+1==a || col+1==a){
            for(int i=col+1;i<a;i++){
                solve(a,row,i,ans+"R");
            }
            for(int i=row+1;i<a;i++){
                solve(a,i,col,ans+"R");
            }
        }
        if(col==row || col+row==a-1){
            int r1=row;
            int c1=col;
            for(int i=1;i<a;i++){
              solve(a,r1+i,c1+i,ans+"B");
            }
        }

    }

}
