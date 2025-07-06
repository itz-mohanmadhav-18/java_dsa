package  java_basics.sorting;

import java.util.Scanner;

public class QuickSort {
      public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        System.out.println("Start entering elements : ");
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        quick_sort(arr,0,len-1);

        for(int x : arr){
            System.out.print(x+" ");
        }

        sc.close();
    }

    public static void quick_sort(int[] arr, int st , int end){

        if(st<end){
            int pivot_pos = partition(arr, st, end);

            quick_sort(arr, st, pivot_pos-1);
            quick_sort(arr,pivot_pos+1 , end);
        }
    }

    public static int partition(int arr[],int start , int end){

        int pivotIndex = start;
        int piv = arr[end];

        for(int i = start ; i<end ; i++){
            if(arr[i]<piv){
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        return pivotIndex;

    }
    
    public static void swap(int arr[] , int i , int j){
        if(arr[i]==arr[j]) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        //arr[i] = arr[i]^arr[j];
        // arr[j] = arr[i]^arr[j];
        //arr[i] = arr[i]^arr[j];
    }
    
}
