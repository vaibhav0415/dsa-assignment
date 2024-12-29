import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("0"+" ");
        print(a,1);

    }
    public static void print(int start,int ans){
        if(ans<=start){
            System.out.print(ans+" ");
        }
        if(ans>start) return;
        // if(ans<9){
        //     print(start,ans+1);
        // }
        for(int i=0;i<=9;i++){
            print(start,ans*10+i);
        }
        if(ans<9){
            print(start,ans+1);
        }


    }
}
