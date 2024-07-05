class Solution {
    public int minCost(String colors, int[] neededTime) {
        int count=0;
        StringBuilder sb=new StringBuilder(colors);
        for(int i=0;i<colors.length()-1;i++)
        {
          if(colors.charAt(i)==colors.charAt(i+1))
          {
            int m=Math.min(neededTime[i],neededTime[i+1]);
            count+=m;
            neededTime[i + 1] = Math.max(neededTime[i], neededTime[i + 1]);
          }
          

        }
        return count;
    }
}