class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        permu(ans,res,freq,nums);
        return ans;
    }
    public static void permu(List<List<Integer>>ans,List<Integer>res,boolean freq[],int nums[])
    {
        if(res.size()==nums.length)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                res.add(nums[i]);
                permu(ans,res,freq,nums);
                res.remove(res.size()-1);
                freq[i]=false;
            }
        }
    }
}