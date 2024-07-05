class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length-1;i++)
        {
            int k=Math.abs(arr[i]-arr[i+1]);
            st.add(k);
        }
        return (st.size()==1);
        
    }
}