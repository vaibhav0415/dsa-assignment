import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        String arr1="";
        arr1=arr1.copyValueOf(arr,0,arr.length);
        solve(arr1,"",str);
    }
    public static void solve(String arr1,String ans,String str){
        if(ans.length()==str.length()){
            if(str.compareTo(ans)>0){
                System.out.println(ans);
            }
             return;
        }
        for(int i=0;i<arr1.length();i++){
            char ch=arr1.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<arr1.length();j++){
                if(ch==arr1.charAt(j))
                flag=true;
            }
            if(flag==false){
               solve(arr1.substring(0,i)+arr1.substring(i+1),ans+arr1.charAt(i),str);
            }
        }
    }
}
