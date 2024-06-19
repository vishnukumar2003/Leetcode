class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len=piles.length/3;
        int max=0;
        for(int i=len;i<piles.length;i=i+2)
        {
            
                max+=piles[i];
        }
        return max;
          
    }
}