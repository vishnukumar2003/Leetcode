class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>ar=new ArrayList<>();
        ArrayList<Integer>ar1=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ar.add(nums[i]);
            }
            else
            {
                ar1.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++)
        {
            ans.add(ar.get(i));
            ans.add(ar1.get(i));
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }
}