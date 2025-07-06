package java_basics.Arrays;

import java.util.*;

public class subarraySumWithNegatives {

    public static void main(String[] args) {
        
        int arr[] = {-2,-1,2,1};
        int k = 1;

        System.out.println(bruteForce(arr, k));
        System.out.println(hashedApproach(arr, k));

    }

    public static int bruteForce(int[] arr,int k){
        int maxLen = 0;
        int sum = 0;
        for(int i = 0 ; i <arr.length ; i++){
            sum = 0;
            for(int j = i ; j<arr.length ;j++){
                sum += arr[j];
                if(sum == k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static int hashedApproach(int[] arr,int k){
        int maxLen = 0;
        int sum = 0 ; 
        Map<Integer,Integer> map= new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){

            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }

            int sumTillY = sum -k;

            if(map.containsKey(sumTillY)){
                maxLen = Math.max(maxLen,i- map.get(sumTillY));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    
}
