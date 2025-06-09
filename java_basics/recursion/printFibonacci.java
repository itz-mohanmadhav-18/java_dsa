package java_basics.recursion;

import java.util.Scanner;

public class printFibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            System.out.print(nFibo(i)+" ");
        }
        sc.close();
    }

    public static int nFibo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        return nFibo(n-1)+nFibo(n-2);
    }
}
