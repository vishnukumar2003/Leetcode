class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    col(dp,j,i);
                    
                }
            }
        }
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=dp[i][j];
                }
            }
        
    }
    public static void col(int dp[][],int j,int k)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][j]=0;
        }
        for(int i=0;i<dp[0].length;i++)
        {
            dp[k][i]=0;
        }
    }
}