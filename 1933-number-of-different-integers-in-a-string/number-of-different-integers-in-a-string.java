import java.math.*;
class Solution {
    public int numDifferentIntegers(String word) {
        int p=word.length();
       String res=word.replaceAll("[a-zA-Z]"," ");
       res=res.trim();
       if(res==""){
        return 0;
       }
       String [] ar=res.split("\\s+");
       if(ar.length==1)
       {
        return 1;
       }

       Set<BigInteger>st=new HashSet<>();
       for(String k:ar)
       {
        st.add(new BigInteger(k));
       }
       return st.size();
        
    }
}