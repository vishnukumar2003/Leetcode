class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer>st=new HashSet<>();
        for(int k:nums1)
        {
            st.add(k);
        }
        Set<Integer>s1=new HashSet<>();
        for(int k:nums2)
        {
            s1.add(k);
        }
        ArrayList<Integer>li=new ArrayList<>();
        for(int k:st)
        {
            li.add(k);
        }
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<li.size();i++)
        {
            if(!hm.containsKey(li.get(i)))
            {
                hm.put(li.get(i),1);
            }
            else
            {
                hm.put(li.get(i),hm.get(li.get(i))+1);
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int k:s1)
        {
            if(hm.containsKey(k))
            {
                res.add(k);
            }
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            ans[i]=res.get(i);
        }
        return ans;
    }
}