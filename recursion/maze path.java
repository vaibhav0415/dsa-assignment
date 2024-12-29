import java.util.*;
public class Main {
    static int count =0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int [][] arr =new int[][];
        printrat("",1,1,a,b);
        System.out.println();
        System.out.println(count);

         
    }
    public static void printrat(String ans,int row,int col,int endr,int endc){
        if(row==endr && col==endc){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(row<=endr-1){
            printrat(ans+"V",row+1,col,endr,endc);     
        }
        if(col<=endc-1){
            printrat(ans+"H",row,col+1,endr,endc);
        }
        if(row<=endr-1 && col<=endc-1){
            printrat(ans+"D",row+1,col+1,endr,endc);
        }
    }
}
