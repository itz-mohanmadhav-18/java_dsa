package java_basics.Arrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 8, 9, 10 };
        /*
         * simple brute force approach
         */
        // int idx = 1;
        
        // for(int i = 0;i<arr.length-1; i++){
        //     if(arr[i]==arr[i+1]){
        //         continue;
        //     }else{
        //         arr[idx++] = arr[i+1];
        //     }
        // }

        // for(int i = idx ; i<arr.length ; i++){
        //     arr[i] = 0;
        // }

        /*
         * we'll try to optimise it by using set
         */

         Set<Integer> set= new TreeSet<>(Arrays.asList(arr));

         List<Integer> arr2 = new ArrayList<>(set);
         int idx = set.size();
         while(idx<arr.length){
            arr2.add(0);
            idx++;
         }

        for(int x:arr2){
            System.out.print(x+" ");
        }

        Integer[] uniqueEle = Arrays.stream(arr).distinct().toArray(Integer[]::new);
        List<Integer> uniqueEle2 = Arrays.stream(arr)
                                            .distinct()
                                            .collect(Collectors.toList());                                   
        int[] unique3 = Arrays.stream(arr).distinct().mapToInt(Integer::intValue).toArray();
    }

}
