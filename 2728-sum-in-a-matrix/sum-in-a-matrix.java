class Solution {
    public int matrixSum(int[][] matrix) {
        int count=0;
       for(int m=0;m<matrix[0].length;m++)
       {
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            int k=0;
             int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                    k=j;
                }
            }
           if(matrix[i][k]>sm)
           {
            sm=matrix[i][k];
           }
            matrix[i][k]=0;
        }
        count+=sm;
       }
       return count;
    }
}