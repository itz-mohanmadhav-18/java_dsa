package java_basics.BasicHashing;

// import java.util.Scanner;
import java.util.*;
public class hashingArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        // printFreq(arr);
        System.out.print("Enter the num for lookup :");
        int num = sc.nextInt();
        int[] freq = freq(arr);
        lookup(freq, num);
        sc.close();
        
    }

    public static int[] freq(int[] arr){
        Arrays.sort(arr);
        int freq[] = new int[arr[arr.length-1]+1];
        for(int x : arr){
            freq[x]++;
        }
        return freq;
    }

    public static void printFreq(int[] freq){
       for(int i = 0 ; i<freq.length ; i++){
        if(freq[i]!=0)
        System.out.println("the freq of "+i+" is : "+freq[i]);
       }
    }

    public static void lookup(int[] freq,int num ){
        if(num>freq.length||freq[num]==0){
            System.out.println("Element is not there is the array");
        }
        else{
            System.out.println("The frequency of "+num+" is : " + freq[num]);
        }
    }
    
}
