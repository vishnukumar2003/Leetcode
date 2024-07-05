class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            st.add(candyType[i]);
        }
        int m=candyType.length/2;
        if(m>st.size())
        {
            return st.size();
        }
        return m;
    }
}