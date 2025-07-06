package Levenshtein_Distance;

import java.util.*;
public class spellChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] Dictionary = {"cred","bet","shat", "that", "brad", "cart", "brat", "card"};

        List<String> matches = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;

        for(String s : Dictionary){
            int distance  = weightedLevenshteinDistance(s, str, 1,1, 1);

            if(distance < minDistance){
                minDistance = distance ;
                matches.clear();
                matches.add(s);
            }else if(distance==minDistance){
                matches.add(s);
            }
        }
        
        System.out.println(matches);
        sc.close();
        
    }
        
    public static int weightedLevenshteinDistance(String str1, String str2, int ci, int cd, int cs) {
        if (str2.isEmpty())
            return str1.length() * cd; 
        if (str1.isEmpty())
            return str2.length() * ci; 

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
       
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i * ci;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i * cd;
        }
        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[0].length; col++) {
                if (str2.charAt(row - 1) == str1.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1]; 
                } else {
                    dp[row][col] = Math.min(
                            dp[row - 1][col - 1] + cs,
                            Math.min(dp[row - 1][col] + ci, dp[row][col - 1] + cd));
                }
            }
        }
  

        return dp[dp.length - 1][dp[0].length - 1];
    }
    
}
