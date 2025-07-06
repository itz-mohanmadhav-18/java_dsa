package java_basics.Arrays;

import java.util.*;

public class subarraySum {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 5 };
        int k = 15;
        // System.out.println(giveLen(arr, k));
        // System.out.println(maxlenOptimised(arr, k));
        System.out.println(maxLen2pointer(arr, k));
    }

    public static String giveLen(int[] arr, int k) {
        int sum = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i ; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    ans.add(j-i+1);
                }
            }
        }
        return ans.toString();
    }

    public static int maxlenOptimised(int[] arr , int k){
        int maxLen = 0; // to track maxLen at a given point of time 
        int sum = 0; // to track prefixSum at any index

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];

            if(sum == k){
                maxLen = i+1;
            }

            /* 
             */

             int jSum = sum - k;

             if(map.containsKey(jSum)){
                maxLen = Math.max(maxLen,i-map.get(jSum));
             }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return maxLen;
    }

    public static int maxLen2pointer(int[] arr , int k){
        int right = 0 , left = 0;
        int maxLen = 0,sum = 0;

        while(right<arr.length){
            sum += arr[right];

             while(sum>k&&left<=right) {
                sum -= arr[left];
                left++;
            }

            if(sum==k){
                maxLen = Math.max(maxLen,right-left+1);
            }

            right++;
        }
        return maxLen;
    }

}
