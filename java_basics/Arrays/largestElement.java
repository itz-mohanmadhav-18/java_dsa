package java_basics.Arrays;

import java.util.Arrays;

public class largestElement {

    public static void main(String[] args) {
        Integer[] arr = {1,5,3,4,9,7,6,0,8,10,15,6,3}; // comparators doesn't works on primitive data types we need to use Integer wrapper class here 

        // Arrays.sort(arr,(a,b)->b-a);//trying comparator approach for sorting a array in descending order

        int max = Integer.MIN_VALUE;
        for(int x : arr){
            if(max<x){
                max = x;
            }
        }

        System.out.println(max);
    }
    
    
}
