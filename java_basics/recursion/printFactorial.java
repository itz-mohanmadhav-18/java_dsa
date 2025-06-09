package java_basics.recursion;

import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find factorial : ");
        int num = sc.nextInt();

        long fact = nFact(num);
        System.out.println(fact);
        sc.close();
    }

    private static int nFact(int num){
        if(num==1){
            return 1;
        }
        return num * nFact(num-1);
    }
}
