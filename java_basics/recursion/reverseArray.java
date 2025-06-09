package java_basics.recursion;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        revArray(arr, 0, len-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
        sc.close();
    }

    public static void revArray(int[] arr,int i,int j){
        if(i >= j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        revArray(arr, i+1, j-1);
    }
    
}
