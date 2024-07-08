class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int k=0;
             int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    k=j;
                }
            }
            int lo=maxi(matrix,k);
            if(min==lo)
            {
                li.add(min);
            }
        }
        return li;
    }
    public static int maxi(int matrix[][],int k)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][k]>max)
            {
                max=matrix[i][k];
            }
        }
        return max;
    }
}