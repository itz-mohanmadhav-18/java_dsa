package java_basics.sorting;

import java.util.Scanner;

public class mergeSort {

        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        System.out.println("Start entering elements : ");
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        merge_sort(arr,0,len-1);
        // insertion_SortD(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }

        sc.close();
    }

    public static void merge_sort(int[] arr , int begin , int end){

        if(begin >= end){
            return;
        }

        int mid = begin + (end-begin)/2;

        merge_sort(arr, begin, mid);
        merge_sort(arr, mid+1, end);
        merge(arr, begin,mid ,end);

    }

    public static void merge(int[] arr,int begin,int mid ,int end){

        int merged[] = new int[end-begin+1];
        
        //make iterators
        int idx1 = begin;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid&&idx2<=end){

            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=end){
            merged[x++]=arr[idx2++];
        }

        for(int i = 0 ; i<merged.length ; i++){
            arr[begin+i] = merged[i];
        }
        

    }
    
}
    