package java_basics.recursion;

import java.util.*;

public class sumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = nSum(num);
        System.out.println(sum);
        sc.close();
    }

    public static int nSum(int num){
        if(num==1){
            return 1;
        }

        return num + nSum(num-1);
    }
    
}
