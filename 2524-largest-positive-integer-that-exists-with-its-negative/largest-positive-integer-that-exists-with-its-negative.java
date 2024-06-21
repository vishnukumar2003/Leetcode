class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(Integer k:nums)
        {
            if(!hm.containsKey(k))
            {
                hm.put(k,1);
            }
            else
            {
                hm.put(k,hm.get(k)+1);
            }
        }
        int count=0;
        int vb=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                int a=nums[i];
                if(hm.containsKey(a*-1))
                {
                    count=nums[i];
                if(count>max)
                {
                    max=count;
                    vb=1;
                }
                }
               
            }
        }
        if(vb==0)
        {
            return -1;
        }
        return max;
   
   
    }
}