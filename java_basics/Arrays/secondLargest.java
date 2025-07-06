package java_basics.Arrays;

import java.util.*;

public class secondLargest {

    public static void main(String[] args) {
        Integer[] arr = { 1, 5, 3, 4, 9, 7, 6, 0, 8, 10, 15, 6, 3, 15 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        /*========================================
         * using simple array approach
         * disadvantage : 2n time complexity
         * =======================================
         */
        // for(int x : arr){
        // if(max < x){
        // max = x;
        // }
        // }

        // for(int x : arr){
        // if(secondMax < x && x < max){
        // secondMax = x;
        // }
        // }
        /*======================================================
         * using hashmap approach
         * disadvantage : storage waste for values in hashmap
         * =====================================================
         */

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int x : arr){
        // map.put(x,map.getOrDefault(map,0)+1);
        // }
        // max = Collections.max(map.keySet());
        // map.remove(max);
        // secondMax = Collections.max(map.keySet());

        /*=================================================================
         * using priority queue
         * disadvantage : if two maximum values arrive this would fail as we are polling
         * twice
         * update : approach fixed
         * ======================================================================
         */
        // PriorityQueue<Integer> maxHeap = new
        // PriorityQueue<>(Collections.reverseOrder());
        // for(int x : arr){
        // maxHeap.add(x);
        // }
        // max = maxHeap.poll();
        // secondMax = maxHeap.poll();

        // while(max == secondMax){
        // secondMax = maxHeap.poll();
        // }
        /*
         * using Treeset
         */

        Set<Integer> set = new TreeSet<>(Arrays.asList(arr)); // we can directly put elements from arr by making it a list to a set 

        max = ((TreeSet<Integer>) set).last(); // here we need to do typecasting as set is a interface that doesn't
                                               // exposes methods of treeSet class; treeset class implement interface
                                               // set
        set.remove(max);
        secondMax = ((TreeSet<Integer>) set).last();

        System.out.println("max is :" + max + " second max is :" + secondMax);

    }

}
