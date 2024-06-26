class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
       int ans1=0;
       int ans2=0;
       for(int i=0;i<arr1.length;i++)
       {
        ans1=ans1^arr1[i];
       }
       for(int i=0;i<arr2.length;i++)
       {
        ans2=ans2^arr2[i];
       }
       return ans1&ans2;
        
    }
}