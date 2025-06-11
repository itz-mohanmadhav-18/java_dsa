/*
 * Direct-Address hashing using array indices
 * offset technique can handel negative values
 */

package java_basics.BasicHashing;

import java.util.*;

public class hashingArraysOffset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Start entering elements : ");
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number for lookup: ");
        int num = sc.nextInt();
        int[] freq = makeFreqArray(arr);

        lookup(freq, getOffset(arr), num);

        sc.close();
        
    }

    public static int getOffset(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int[] makeFreqArray(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int size = max - min + 1;
        int[] freq = new int[size];
        for(int x : arr){
            freq[x-min]++;
        }
        return freq;
    }

    public static void lookup(int[] freq , int offset,int num){
        if(num >= freq.length||freq[num-offset]==0){
            System.out.println("Element is not there is the array");
        }
        else{
            System.out.println("The frequency of "+num+" is : " + freq[num-offset]);
        }
    }
}
