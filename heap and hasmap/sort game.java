import java.util.*;
class Pair implements Comparator<Pair>{
    String name;
    int salary;
    Pair(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    Pair(){}
 
    public int compare(Pair s1,Pair s2){
        if(s1.salary!=s2.salary) return s2.salary-s1.salary;
        else return s1.name.compareTo(s2.name);
    }
}
public class Main {
    public static void main(String args[]) {
  
        Scanner sc=new Scanner(System.in);
        int barrier=sc.nextInt();
        int size=sc.nextInt();
        ArrayList<Pair> ar=new ArrayList<>();
        while(size-->0){
            String e=sc.next();
            int s=sc.nextInt();
            
            if(s>=barrier){
                ar.add(new Pair(e,s));
            }
        }
     Collections.sort(ar,new Pair());
        for(Pair p:ar){
            System.out.println(p.name+" "+p.salary);
        }
    }
}
