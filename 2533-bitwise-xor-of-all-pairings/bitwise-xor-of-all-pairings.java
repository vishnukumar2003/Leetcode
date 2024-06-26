class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans1=0;
        int ans2=0;
        for(int i=0;i<nums1.length;i++){     
            ans1=ans1^nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            ans2=ans2^nums2[j];
        }
        int result=0;
        if(nums1.length %2!=0) result =result^ans2;
        if(nums2.length %2!=0) result =result^ans1;
        return result;
    }
}