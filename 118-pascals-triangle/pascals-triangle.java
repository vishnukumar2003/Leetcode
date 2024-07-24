class Solution {
    public List<List<Integer>> generate(int n) {
       List<List<Integer>>li=new ArrayList<>();
       for(int i=1;i<=n;i++)
       {
        List<Integer>l2=new ArrayList<>();
        for(int j=1;j<=i;j++)
        {
            l2.add(ncr(i-1,j-1));
        }
        li.add(l2);
       }
       return li; 
    }
    public static int ncr(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}