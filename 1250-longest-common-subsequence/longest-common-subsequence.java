class Solution {
 public int longestCommonSubsequence(String text1, String text2) {
     int arr[][]=new int[text1.length()+1][text2.length()+1]; 
     for(int i=0;i<arr.length;i++)
     {
        arr[i][0]=0;
     }
     for(int i=0;i<arr[0].length;i++)
     {
        arr[0][i]=0;
     }

      for(int i=1;i<arr.length;i++)
      {
        for(int j=1;j<arr[0].length;j++)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1))
            {
                arr[i][j]=1+arr[i-1][j-1];
            }
            else
            {
                arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
      }
      return arr[arr.length-1][arr[0].length-1];



    }
}