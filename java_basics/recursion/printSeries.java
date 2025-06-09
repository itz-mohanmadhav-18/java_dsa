
package java_basics.recursion;

import java.util.Scanner;

public class printSeries {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printCount(0,n);
    
   }

   public static void printCount(int i,int n){
    if(i>n){
        return;
    }
    System.out.print(i+" ");
    printCount(i+1,n);
   }
}
