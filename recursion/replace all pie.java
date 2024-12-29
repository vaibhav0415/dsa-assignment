import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            String b=sc.next();
            solve(b,"");
            System.out.println();
        }
    }
        public static void solve(String real,String answer){
            if(real.length()==0){
                System.out.print(answer);
                return;
            }
            if(real.charAt(0)=='p' && real.charAt(1)=='i'){
                solve(real.substring(2),answer+3.14);
            }
            else{
                 solve(real.substring(1),answer+real.charAt(0));
            }
        }
    
}