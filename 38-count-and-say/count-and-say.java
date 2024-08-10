class Solution {
    public String countAndSay(int n) {
        String cs="1";
        
        for(int i=1;i<n;i++)
        {
            String say="";
        int j=0;
           while(j<cs.length())
           {
            int count=1;
            while(j<cs.length()-1 && cs.charAt(j)==cs.charAt(j+1))
            {
                count++;
                j++;
            }
            say=say+count+cs.charAt(j);
            j++;
           }
           cs=say;
        }
        return cs;
        
    }
}