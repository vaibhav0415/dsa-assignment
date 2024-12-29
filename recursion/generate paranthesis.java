import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       ArrayList<String> lava=new ArrayList<>();
       int z=sc.nextInt();
       genrt(z,0,0,"",lava);
       for(String str : lava){
           System.out.println(str);
       }
    }
    public static void genrt(int z,int o,int c,String uttar,ArrayList<String> lava){
          if(o==z && c==z){
              lava.add(uttar);
              return;
          }
        //   if(o<z){
        //       genrt(z,o+1,c,uttar+"(",lava);
        //   }
          if(c<o){
              genrt(z,o,c+1,uttar+")",lava);
          }
          if(o<z){
              genrt(z,o+1,c,uttar+"(",lava);
          }

    }
}