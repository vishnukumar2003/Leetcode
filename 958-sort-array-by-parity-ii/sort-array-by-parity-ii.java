class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        int k=0;
        int l=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                res[k]=nums[i];
                k=k+2;
            }
            else
            {
                res[l]=nums[i];
                l=l+2;
            }

        }
        return res;
    }
}