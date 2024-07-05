class Solution {
    public boolean judgeCircle(String moves) {
      int l=0;
      int r=0;
      for(int i=0;i<moves.length();i++)
      {
        if(moves.charAt(i)=='L')
        {
            l++;
        }
         if(moves.charAt(i)=='R')
        {
            l--;
        }
         if(moves.charAt(i)=='U')
        {
            r++;
        }
         if(moves.charAt(i)=='D')
        {
            r--;
        }

      }
      return (l==0 && r==0);
    }
}