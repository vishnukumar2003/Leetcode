class Solution {
    public int numWaterBottles(int n, int e) {
       int rem=0;
       int count=n;
       while(n>0)
       {
         rem=n%e;
         n=n/e;
         if(n==0)
         {
            break;
         }
         count+=n;
         n=n+rem;
       }
       return count;
    }
}