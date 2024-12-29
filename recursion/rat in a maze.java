import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char ch[][]=new char[row][col];
        for(int i=0;i<row;i++){
            String s=sc.next();
            for(int j=0;j<col;j++){
                 ch[i][j]=s.charAt(j);
            }
        }
        boolean flag[]=new boolean[1];
        helper(ch,0,0,flag);
        if(!flag[0]){
            System.out.println("-1");
        }
    }
    public static void helper(char[][] ch,int row,int col,boolean[] flag){
       if(row>ch.length-1 || col>ch[0].length-1 || flag[0]) return;
       if(ch[row][col]=='X') return;
       if(row==ch.length-1 && col==ch[0].length-1) {
           ch[row][col]='1';
           flag[0]=true;
           for(int i=0;i<ch.length;i++){
               for(int j=0;j<ch[0].length;j++){
                   if(ch[i][j]=='1')
                   System.out.print("1"+" ");
                   else
                   System.out.print("0"+" ");
               }
               System.out.println();
           }
           return;
       }
       
       
        ch[row][col]='1';
        helper(ch,row,col+1,flag);
        helper(ch,row+1,col,flag);
        if(!flag[0])
        ch[row][col]='0';
    }
}
