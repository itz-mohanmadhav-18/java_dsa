package java_basics;

import java.util.Scanner;

class Gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        int gcd = gcdRecursive(num1, num2);

        // for(int i = 1; i<=num1&&i<=num2 ; i++){
        //     if(num1%i==0 && num2%i==0){
        //         gcd = i;
        //     }
        // }
        System.out.println("GCD of "+num1+" and "+num2+" is: "+ gcd);
        sc.close();
    }

    private static int gcdRecursive(int a , int b){
        if(b==0){
            return a;
        }
        return gcdRecursive(b, a%b);
    }
}