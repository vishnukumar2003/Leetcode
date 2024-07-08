class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        for(int i=0;i<col;i++)
        { int max=Integer.MIN_VALUE;

            for(int j=0;j<row;j++)
           {
            max=Math.max(max,matrix[j][i]); 
           }
          for(int j=0;j<row;j++)
          {
           
           if(matrix[j][i] == -1)
         {
            matrix[j][i]=max;        
         }
          }

             }

        return matrix;
    }
}