package leet.java.conversions;

/**
 * Leet code only supports java, so I converted my scala solution
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String str) {
        var n = str.length();
        boolean pals[][] = new boolean[n][n];

        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            pals[i][i] = true;

        var longest = str.substring(str.length() - 1, str.length());

        for(int l = 2; l <= n; l++) {
            for(int s = 0; s <= (n - l); s++) {
                if(str.charAt(s) == str.charAt(s + l - 1) &&
                    (l <= 3 || pals[s + 1][s + l - 2])) {
                    pals[s][s + l - 1] = true;
                    longest = str.substring(s, s + l);
                }
            }
        }
        return longest;
    }
}
