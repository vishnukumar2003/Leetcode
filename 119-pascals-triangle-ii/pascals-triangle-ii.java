class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                list.add(1);
                else
                {
                    List<Integer> prevRow = ans.get(i - 1);
                    int value = prevRow.get(j - 1) + prevRow.get(j);
                    list.add(value);
                }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
    }
}