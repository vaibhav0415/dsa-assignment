import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] array1=str.toCharArray();
        Arrays.sort(array1);
        String lexi1="";
        lexi1=lexi1.copyValueOf(array1,0,array1.length);
        answer(lexi1,"",str);

    }
    public static void answer(String str,String uttar,String arrays){
        if(str.length()==0){
             if(arrays.compareTo(uttar)<0){
                 System.out.println(uttar);
             }
                 return;
             }
             for(int i=0;i<str.length();i++){
                 char ch=str.charAt(i);
                 boolean flag=false;
                 for(int j=i+1;j<str.length();j++){
                     if(ch==str.charAt(j)){
                         flag=true;
                     }

                 }
                 if(flag==false){
                     answer(str.substring(0,i)+str.substring(i+1),uttar+str.charAt(i),arrays);
                 }

             }
             

        }
       
    }

