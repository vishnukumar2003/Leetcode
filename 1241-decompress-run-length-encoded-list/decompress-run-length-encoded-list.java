class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList <Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length-1;i=i+2)
        {
            for(int j=0;j<nums[i];j++)
            {
                li.add(nums[i+1]);
            }
        }
        int res[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            res[i]=li.get(i);
        }
        return res;
    }
}