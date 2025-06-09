package java_basics.recursion;

import java.util.Scanner;

public class printNameNTimesWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to print : ");
        String data = sc.nextLine();
        System.out.print("enter number of times you want to print : ");
        int num = sc.nextInt();
        printString(data, num);
        sc.close();
    }

    public static void printString(String data , int n){

        if(n<=0){
            return;
        }
        System.out.println(data);
        printString(data, n-1);

    }

    
}
