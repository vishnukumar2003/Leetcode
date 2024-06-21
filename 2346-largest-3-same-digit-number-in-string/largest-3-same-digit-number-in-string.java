class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<num.length()-2;i++)
        {
          int count=0;
           if((num.charAt(i)==num.charAt(i+1)) && (num.charAt(i+1)==num.charAt(i+2)))
           {
               count=num.charAt(i)-'0';
               if(count>max)
           {
            max=count;
           }
           }
           
        }
        String s="";
        if(max==Integer.MIN_VALUE)
        {
            return s;
        }
        for(int i=0;i<3;i++)
        {
            s+=max;
        }
        return s;
    }
}