package java_basics.sorting;

import java.util.*;
public class insertionSort {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        System.out.println("Start entering elements : ");
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        insertion_Sort(arr);
        insertion_SortD(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }

        sc.close();
    }

    /*
     * Insertion sort can be visualized a sorting a deck of cards at any point of time subArray(0,i-1) is always sorted
     * it work on keys and shifting {not swapping}
     * Best case ~ when array is already sorted : O(n);
     * Worst case ~ sorted in reverse order : O(n^2);
     * Avg case ~ anyway bw : O(n^2) {near about worst case}
     * total number of swaps in worst case : n(n-1)/2
     */


    public static void insertion_Sort(int[] arr){
        for(int i = 1 ; i<arr.length ; i++){

            int key = arr[i];

            int j = i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }

    }
    public static void insertion_SortD(int[] arr){
        for(int i = 1 ; i<arr.length ; i++){

            int key = arr[i];

            int j = i-1;

            while(j>=0&&arr[j]<key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
    }


//     public static void insertion_Sort(int[] arr){
//     int comparisons = 0;
//     int shifts = 0;

//     for(int i = 1; i < arr.length; i++) {
//         int key = arr[i];
//         int j = i - 1;

//         while(j >= 0) {
//             comparisons++; // Count comparison: arr[j] > key
//             if(arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//                 shifts++;
//             } else {
//                 break;
//             }
//         }
//         arr[j + 1] = key;
//     }

//     System.out.println("Total comparisons : " + comparisons);
//     System.out.println("Total shifts      : " + shifts);
// }

    
}   