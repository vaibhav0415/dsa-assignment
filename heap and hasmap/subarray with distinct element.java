import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] num= new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            while (j < size&& !map.containsKey(num[j])) {
                map.put(num[j], i);
                j++;
            }
            int len = j - i;
            ans += len * (len + 1) ;
            map.remove(num[i]);
        }
        System.out.println((ans/2));
    }
}
