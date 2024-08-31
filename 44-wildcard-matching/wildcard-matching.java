import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int dp[][] = new int[n + 1][m + 1]; // Corrected dimensions

        // Initialize the dp array with -1 to signify uncomputed states
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        
        return wild(n - 1, m - 1, s, p, dp) == 1;
    }

    // Helper function to check if all remaining characters in the pattern `p` are '*'
    public boolean help(String p, int j) {
        for (int i = 0; i <= j; i++) {
            if (p.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }

    // Recursive function with memoization to check for a match
    public int wild(int i, int j, String s, String p, int dp[][]) {
        if (i < 0 && j < 0) {
            return 1; // Both strings are exhausted and matched
        }
        if (i < 0 && j >= 0) {
            return help(p, j) ? 1 : 0; // If only pattern is left, it must be all '*'
        }
        if (j < 0 && i >= 0) {
            return 0; // Pattern is exhausted but string is not
        }

        // Memoized result
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            dp[i][j] = wild(i - 1, j - 1, s, p, dp); // Characters match or pattern is '?'
        } else if (p.charAt(j) == '*') {
            dp[i][j] = (wild(i - 1, j, s, p, dp) == 1 || wild(i, j - 1, s, p, dp) == 1) ? 1 : 0;
        } else {
            dp[i][j] = 0; // Characters do not match
        }
        
        return dp[i][j];
    }
}
