class Solution {
    public int largestCombination(int[] can) {
        int res[]=new int[32];
        for(int i=0;i<can.length;i++)
    {
       for(int j=0;j<32;j++)
       {
        int temp=can[i]&(1<<j);
        if(temp!=0)
        {
            res[j]+=1;
        }
       }
    }
    Arrays.sort(res);
 return res[res.length-1];
    }
}