import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> freq = new HashMap<>();
          int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int temp=nums1[i];
            freq.put(temp, freq.getOrDefault(temp, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp=nums2[i];
            if (freq.containsKey(temp) && freq.get(temp) > 0) {
                freq.put(temp, freq.get(temp) - 1);  
                ans.add(temp);  
            }
        }

       
        Collections.sort(ans);

        System.out.print(ans);
    }
}
