package Levenshtein_Distance;

import java.util.*;
public class levenshteinDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(getDistance(str1, str2));
        sc.close();
    }

    public static int getDistance(String str1, String str2) {
        if (str1.length() == 0)
            return str2.length();
        if (str2.length() == 0)
            return str1.length();

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];// I'm assuming word1 needs to be converted into
                                                                   // word2 so while making dp table i'm taking word2 on
                                                                   // y axis and word1 on x axis

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;// filling it with index because coversion from empty string to a string of
                         // len(i) require i insertions
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;// filling it with index because coversion from a string of len(i) to a empty
                         // string would require i deletions
        }

        // now we will start filling our dp table
        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[0].length; col++) {
                if (str2.charAt(row - 1) == str1.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1]; // if the characters are same ignore the current chars and fill
                                                         // dp with previous result
                } else {

                    dp[row][col] = 1 + Math.min(dp[row - 1][col - 1], Math.min(dp[row - 1][col], dp[row][col - 1]));
                    // adding 1 shows that we need to perform a operation there
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
inp: str1 = horse
str2 = java

dp matrix :
0 1 2 3 4 5 
1 1 2 3 4 5
2 2 2 3 4 5
3 3 3 3 4 5
4 4 4 4 4 5

op = 5;
 
 */