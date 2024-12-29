import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int[] arr=new int[c];
        for(int i=0;i<c;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        System.out.println(last(arr,c-1,d));

    }
    public static int last(int[] arr,int n,int d){
        if(n<0){
            return -1;
        }
        if(arr[n]==d){
            return n;
        }
        else{
           return last(arr,n-1,d);
        }
    }
}
