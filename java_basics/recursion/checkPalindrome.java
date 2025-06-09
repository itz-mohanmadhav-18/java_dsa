package java_basics.recursion;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(isPalindrome(s,0,s.length()-1));
        sc.close();
    }

    private static boolean isPalindrome(String s ,int i , int j){
        if(i>=j){
            return true;
        }

        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }

        return isPalindrome(s, i+1, j-1);

    }
}
