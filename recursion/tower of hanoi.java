import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         vietnam(a,'A','C','B');

    }
    public static void vietnam(int disk_no,char source,char helper,char destination){
        if(disk_no==0) return;
        vietnam(disk_no-1,source,destination,helper);
        System.out.println("Moving ring "+disk_no+" from "+source+" to "+destination);
        vietnam(disk_no-1,helper,source,destination);
        // System.out.println("Moving ring "+disk_no+" from "+source+" to "+helper);
    }
}