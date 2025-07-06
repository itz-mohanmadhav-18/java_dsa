package Levenshtein_Distance;

import java.util.Scanner;

public class spaceOptimisedLevenshtein {
    /*
     * We will optimise the space computation alongwith prefix and suffix trimming
     * idea is : we only need two rows of dp tables at any instant so instead of
     * making whole dp table we can just use
     * : two arrays of single dimension to store and update the minimum values at
     * any instant for each iteration
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int ci = sc.nextInt();
        int cd = sc.nextInt();
        int cs = sc.nextInt();
        String[] s = optimisationFn(s1, s2);

        System.out.println(spaceOptimisedWeightedLevenshteinDistance(s[0], s[1], ci, cd, cs));
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

    public static int spaceOptimisedWeightedLevenshteinDistance(String str1, String str2, int ci, int cd, int cs) {

        if (str2.isEmpty())
            return str1.length() * cd;
        if (str1.isEmpty())
            return str2.length() * ci;

        int[] prev = new int[str1.length() + 1];//declaring first two rows
        int[] curr = new int[str1.length() + 1];

        for (int i = 0; i <=str1.length(); i++) {
            prev[i] = i * cd;// initialising base case for the first row
        }

        for (int i = 1; i <=str2.length(); i++) {
            curr[0] = i * ci;//filling the base case for the first element of every row ( i works for str2 j works for str1 )

            for (int j = 1; j <=str1.length(); j++) {

                if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
                    curr[j] = prev[j - 1];
                } else {
                    curr[j] = Math.min(
                            prev[j - 1] + cs,
                            Math.min(
                                    prev[j] + ci,
                                    curr[j - 1] + cd)
                                    );
                }

            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[str1.length()];
    }
}
