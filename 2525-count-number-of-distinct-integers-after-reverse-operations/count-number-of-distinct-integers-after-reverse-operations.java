class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ar.add(nums[i]);
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
            ar.add(rev);
        }
        Set<Integer>hm=new HashSet<>();
        for(int i=0;i<ar.size();i++)
        {
            hm.add(ar.get(i));
        }
        return hm.size();
    }
}