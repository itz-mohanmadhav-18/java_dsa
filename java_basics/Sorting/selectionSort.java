package java_basics.sorting;

import java.util.Scanner;

public class selectionSort {



    /*
     * Tc  = O(n^2)  for all cases 
     */

    public static void selection_Sort(int[] arr){

        for(int i = 0 ; i<arr.length ; i++){
            int idx = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

    }
    
}
