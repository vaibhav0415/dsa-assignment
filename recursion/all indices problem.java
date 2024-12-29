import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] ar=new int[length];
        for(int i=0;i<length;i++){
                 ar[i]=sc.nextInt();
        }
        int match_tar=sc.nextInt();
        idx_match(0,length,ar,match_tar);
    }
    public static void idx_match(int idx,int n,int[] ar,int match_tar){
        if(idx>=n){
           return;
           }
           if(ar[idx]==match_tar){
               System.out.print(idx+" ");
           }
           idx_match(idx+1,n,ar,match_tar);

    }
}
