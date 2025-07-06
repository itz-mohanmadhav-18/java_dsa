package java_basics.Arrays;

import java.util.*;
import java.util.stream.Collectors;


public class unionOfTwoSortedArrays {

    public static void main(String[] args) {
        Integer arr1[] = { 0, 9, 5, 0, 7, 0, 4, 2, 6, 0, 3 };
        Integer arr2[] = { 5, 5, 20, 5, 77, 89, 454, 0, 9, 8, 7, 4, 2, 1, };
        //================================================================
        // Approach 1 : using treeSet for sorting and removing duplicates
            //      Tc : O(m+n)          *         O(log (m+n)) 
            //      tc of insertion                tc of sorting
        //================================================================

        TreeSet<Integer> ans = new TreeSet<>(Arrays.asList(arr1));
        for(int x : arr2) ans.add(x);
        
        System.out.println(ans.toString());

        //================================================================
        //Approach 2 : using List only and then sorting it with collections .sort 
        // Tc: O(n+m)Log(n+m)) || can go upto n^2 as .contains performs linear search
        //================================================================
        List<Integer> ans2 = new ArrayList<>();
        
        for(int x: arr1){
            if(!ans2.contains(x)){
                ans2.add(x);
            }
        }
        for(int x: arr2){
            if(!ans2.contains(x)){
                ans2.add(x);
            }
        }
        Collections.sort(ans2);
        System.out.println(ans2.toString());
        
    }

}
