package Levenshtein_Distance;

import java.util.*;
public class weighted_levenshtein {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int ci = sc.nextInt();
        int cd = sc.nextInt();
        int cs = sc.nextInt();
        System.out.println(weightedLevenshteinDistance(str1, str2, ci, cd, cs));
        sc.close();

    }

    public static int weightedLevenshteinDistance(String str1, String str2, int ci, int cd, int cs) {
        if (str2.isEmpty())
            return str1.length() * cd; // if str2 is empty then we need to delete all the characters from str1 with
                                       // cost cd so i multiplied it with cd
        if (str1.isEmpty())
            return str2.length() * ci; // if str1 is empty then we need to insert all characters of str1 into str2 with
                                       // cost ci

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
        /*
         * I'm Assuming that ->
         * on going left to right we are performing delete operation
         * on going top to bottom we are performing insert operation
         * on going diagonal we are performing replace operation
         */
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i * ci;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i * cd;
        }
        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[0].length; col++) {
                if (str2.charAt(row - 1) == str1.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1]; // no cost will be added because characters are same;
                } else {
                    dp[row][col] = Math.min(
                            dp[row - 1][col - 1] + cs,
                            Math.min(dp[row - 1][col] + ci, dp[row][col - 1] + cd));
                }
            }
        }
        // for (int[] temp : dp) {
        //     for (int x : temp) {
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }

        return dp[dp.length - 1][dp[0].length - 1];
    }

}

/*
 * ip : str1 = horse
 * str2 = java
 * 
 * dp matrix :
 * 0 2 4 6 8 10
 * 1 2 3 4 5 6
 * 2 3 4 5 6 7
 * 3 4 5 6 7 8
 * 4 5 6 7 8 9
 * 
 * op : 9
 */
