import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
         System.out.println(print(arr,0,n-1,m));
    }
    public static int print(int arr[],int i,int n,int m){
        if(i>n){
            return -1;
        }
        if(arr[i]==m){
            return i;
        }
        else{
           return print(arr,i+1,n,m);
        }
    }
}
