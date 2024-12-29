import java.util.*;
public class Main {
   
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ArrayList<String> ar= new ArrayList<>();
        county(ar,"",1,1,a,b);
        for(String c: ar)
        System.out.print(c+" ");
        System.out.println();
        System.out.println(ar.size());

    }
    public static void county(ArrayList<String> ar,String ans,int row,int col,int endr,int endc){
         if(row==endr && col==endc){
             
             ar.add(ans);
             return;
         }
         if(row>endr || col>endc) return;
         county(ar,ans+"V",row+1,col,endr,endc);
         county(ar,ans+"H",row,col+1,endr,endc);


         

    }
}
