
package Levenshtein_Distance;

import java.util.Scanner;

public class optimisedLevenshtein {

    /*
     * I'm utilizing a simple optimization technique here of trimming common suffix
     * and prefixes which can significantly save compute and storage
     * 
     * eg. for two strings "Mohan" & "Sohan" instead of constructing a full matrix
     *     of 6*6 after optimisation it would require only 2*2 matrix to serve the purpose 
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int ci = sc.nextInt();
        int cd = sc.nextInt();
        int cs = sc.nextInt();
        String[] s = optimisationFn(s1, s2);

        System.out.println(weightedLevenshteinDistance(s[0], s[1], ci, cd, cs));
        sc.close();

    }

    public static String[] optimisationFn(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        // checking for common prefixes
        int start = 0;
        int minLen = Math.min(len1, len2);

        while (start < minLen && s1.charAt(start) == s2.charAt(start)) {
            start++;
        }

        // checking for common suffixes
        int end1 = s1.length() - 1;
        int end2 = s2.length() - 1;
        while (end1 >= start && end2 >= start) {
            if (s1.charAt(end1) == s2.charAt(end2)) {
                end1--;
                end2--;
            } else {
                break;
            }
        }

        // calcluating for uncommon substring;

        s1 = s1.substring(start, end1 + 1);
        s2 = s2.substring(start, end2 + 1);

        return new String[] { s1, s2 };

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
