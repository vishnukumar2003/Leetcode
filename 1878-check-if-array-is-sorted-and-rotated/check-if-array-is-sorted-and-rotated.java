class Solution {
    public boolean check(int[] nums) {
        ArrayList<Integer>li=new ArrayList<>();
        ArrayList<Integer>copy=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            li.add(nums[i]);
            copy.add(nums[i]);
        }    
        Collections.sort(li);
        int i=0;
        int count=0;
        while(count<copy.size())
        {
            int idx=li.get(i);
            li.remove(i);
            li.add(idx);
            count++;
            if(li.equals(copy))
            {
                return true;
            }
        }
        return false;
    }
}