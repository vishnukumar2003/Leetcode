class Solution {
    public int countDistinctIntegers(int[] nums) {
          Set<Integer>hm=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int rev=0;
            int digit=0;
            while(num>0)
            {
               digit=num%10;
               rev=rev*10+digit;
               num=num/10; 
            }
            hm.add(rev);
        }
     
        return hm.size();
    }
}