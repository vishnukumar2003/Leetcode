class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        int res;
        for(int i=0;i<candies.length;i++)
        {
           l2.add(candies[i]);
        }
        int max=Collections.max(l2);
        for(int i=0;i<candies.length;i++)
        {
           res=extraCandies+candies[i];
           if(res>=max)
           {
            l1.add(true);
           }
           else
           {
            l1.add(false);
           }
        }
       return l1; 
    }
}