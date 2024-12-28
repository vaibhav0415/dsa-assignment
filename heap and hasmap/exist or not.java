import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
             int size=sc.nextInt();
             HashSet<Integer> set=new HashSet<>();
             for(int i=0;i<size;i++){
                 set.add(sc.nextInt());
             }
             int q=sc.nextInt();
             for(int i=0;i<q;i++){
                 if(set.contains(sc.nextInt())){
                     System.out.println("Yes");
                 }
                 else{
                     System.out.println("No");
                 }
             }
             System.out.println();   
         }
    }
}