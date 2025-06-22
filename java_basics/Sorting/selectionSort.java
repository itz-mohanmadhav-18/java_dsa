package java_basics.Sorting;

import java.util.Scanner;

public class selectionSort {

        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        System.out.println("Start entering elements : ");
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        selection_Sort(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }

        sc.close();
    }

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
