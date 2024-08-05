class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i],1);
        }
        int ans=0;
        for(int i=0;i<nums.length+1;i++)
        {
            if(!map.containsKey(i))
            {
                 ans=i;
            }
        }
        return ans;
    }
}