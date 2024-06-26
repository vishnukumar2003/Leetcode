class Solution {
    public int[] singleNumber(int[] nums) {
      int ans=0;
      for(int i:nums)
      {
        ans^=i;
      }     
      int a=1;
      int count=0;
      while((ans&1)!=1)
      {
        count++;
        ans=ans>>1;
      }
      int first=0;
      int second=0;
      for(int num:nums)
      {
        if(((num>>count)&1)==1)
        {
            first^=num;
        }
        else
        {
            second^=num;
        }

      }
      return new int[]{first,second};
    }
}