class Solution {
    static final int MISSING = -1;
    int n;
    int[] nums;
    int[][][] cache, take;
    int dp(int bitset, int first, int last) {
        if (cache[bitset][first][last] != MISSING) {
            return cache[bitset][first][last];
        }
        if (bitset == (1 << n) - 1) {
            return Math.abs(last - nums[first]);
        }
        int resCost = Integer.MAX_VALUE;
        int resTake = 0;
        for (int i = 0; i < n; ++i) {
            if ((bitset & (1 << i)) == 0) {
                int potential = dp(bitset | (1 << i), first, i) + Math.abs(last - nums[i]);
                if (potential < resCost) {
                    resCost = potential;
                    resTake = i;
                }
            }
        }
        take[bitset][first][last] = resTake;
        return cache[bitset][first][last] = resCost;
    }
    public int[] findPermutation(int[] nums) {
        n = nums.length;
        this.nums = nums;
        cache = new int[1 << n][n][n];
        take = new int[1 << n][n][n];
        for (int[][] matrix : cache) {
            for (int[] row : matrix) {
                Arrays.fill(row, MISSING);
            }
        }
        int resCost = dp(1, 0, 0);
        int resTake = 0;
        for (int i = 1; i < n; ++i) {
            int potential = dp(1 << i, i, i);
            if (potential < resCost) {
                resCost = potential;
                resTake = i;
            }
        }
        int[] perm = new int[n];
        for (int i = 0, bitset = 1 << resTake, first = resTake, last; i < n; ++i) {
            perm[i] = last = resTake;
            bitset |= 1 << (resTake = take[bitset][first][last]);
        }
        return perm;
    }
}