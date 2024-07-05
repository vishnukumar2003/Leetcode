class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>max)
           {
            max=nums[i];
            j=i;
           }
        }
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=max && nums[i]*2<=max)
            {
                count++;
            }
        }
        if(count==nums.length)
        {
            return j;
        }
        return -1;

 



    }
}