import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int count=solvesub(arr,b,"",0);
        System.out.println();
        System.out.println(count);
    }
    public static int solvesub(int[] arr, int target, String ans,int index){
        if(target==0){
            System.out.print(ans+" ");
            return 1;
        }
        if(target<0){
            return 0;
        }
        int c=0;
        for(int i=index;i<arr.length;i++){
            c+=solvesub(arr,target-arr[i],ans+arr[i]+" ",i+1);
        }
        return c;
    }
}
