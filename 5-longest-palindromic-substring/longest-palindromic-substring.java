class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        String max="";
       
     for(int i=0;i<len;i++)      
     {
        for(int j=len-1;j>=0;j--)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                if(palin(s.substring(i,j+1)))
                {
                    max=max.length()<s.substring(i,j+1).length()? s.substring(i,j+1) : max;
                   
                    break;
                }
            }
        }
     }
     return max;
   
    }
    public static boolean palin(String h)
    {
        StringBuilder sb=new StringBuilder(h);
         sb.reverse();
         if(h.equals(sb.toString()))
         {
            return true;
         }
         return false;
    }
}