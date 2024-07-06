class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flipCount = 0, currFlips = 0;
        
        int[] isFlipped = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                currFlips ^= isFlipped[i - k];
            }
            
            if (nums[i] == currFlips) {
                if (i + k > n) {
                    return -1;
                }
                
                isFlipped[i] = 1;
                currFlips ^= 1;
                flipCount++;
            }
        }
        
        return flipCount;
    }
}
