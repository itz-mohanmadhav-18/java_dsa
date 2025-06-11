package java_basics.BasicHashing;

import java.util.*;

public class highestAndLowestFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " of elements :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printMaxMinFreqNumber(arr);

        sc.close();
    }

    public static void printMaxMinFreqNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int minFreq = Collections.min(map.values());
        int maxFreq = Collections.max(map.values());

        System.out.println("Min frequency is " + minFreq + " of element : ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minFreq) {
                System.out.println(entry.getKey() + " ");
            }
        }

        System.out.println("Max frequency is " + maxFreq + " of element : ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                System.out.println(entry.getKey() + " ");
            }
        }

    }

}
