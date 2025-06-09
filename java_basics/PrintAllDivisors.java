package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print all its divisors: ");
        int n = sc.nextInt();
        int[] ans = getDivisorsOptimised(n);
        Arrays.sort(ans);
        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }

    public static int[] getDivisors(int n){
        List<Integer> l = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                l.add(i);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int[] getDivisorsOptimised(int n){
        List<Integer> l = new ArrayList<>();
        for(int i = 1 ; i*i <=n ; i++){
            if(n%i==0){
                l.add(i);
                l.add(n/i);
            }
        }

        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
