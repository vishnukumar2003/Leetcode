class Solution {
    public String sortSentence(String s) {
       String[]ch=s.split("\\s");
       String res="";
       for(int i=1;i<=ch.length;i++)
       {
        String k=Integer.toString(i);
        for(int j=0;j<ch.length;j++)
        {
            int lo=ch[j].indexOf(k);
        if(lo!=-1)
        {
            String ff=ch[j].substring(0,ch[j].length()-1);
            res=res+ff+" ";
            break;
        }
       }
       }
      return res.trim();
    }
}