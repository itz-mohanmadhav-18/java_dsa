package java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime : ");
        int n = sc.nextInt();
        Boolean ans = checkPrime(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        //approach 1 check till n:
        // for(int i = 2 ; i<n ; i++){
        //     if(n%i==0){
        //         isPrime = false;
        //     }
        // }
        //======================================
        // approach 2 checking till n/2;
        // for(int i = 2 ; i<n/2 ; i++){
        //     if(n%i==0){
        //         isPrime = false;
        //     }
        // }
        //===================================
        // approach 3 checking till n^1/2
        for(int i = 2 ; i<Math.sqrt(n);i++){
            if (n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
