package Advanced_DSA.DP;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // System.out.println(fiboTD(n,dp));
        System.out.println(fiboBU(n));
        sc.close();
    }
    // Top-Down Dp 
    public static int fiboTD(int num , int[] dp){
        if(num<=1) return num;

        if(dp[num]!=-1){

            // System.out.print(num+"=>"+dp[num]+" ");
            return dp[num];
        } 

        return dp[num] = fiboTD(num-1, dp) + fiboTD(num-2, dp);
    }

    public static int fiboBU(int num ){
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i<=num;i++){
            dp[i] = dp[i-1]+dp[i-2];
            System.out.print("fibo at "+i+"="+dp[i]+" ");
        }

        return dp[num];
    }
    
}