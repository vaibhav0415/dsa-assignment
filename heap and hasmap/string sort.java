import java.util.*;
class comparator implements Comparator<String>{
    public int compare(String a,String b){
        if(a.length()<=b.length() && b.startsWith(a)){
            return 1;
        }
        else if(a.length()>=b.length() && a.startsWith(b)) return -1;
        else return a.compareTo(b);
    }
}
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       String[] s=new String[a];
       for(int i=0;i<a;i++){
           s[i]=sc.next();
       }
       Arrays.sort(s,new comparator());
       for(String str:s){
           System.out.println(str);
       }

    }
}