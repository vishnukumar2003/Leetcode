class Solution {
    public String sortVowels(String s) {
       List <Character> vow=new ArrayList<>();
       StringBuilder sb=new StringBuilder(s);
       for(int i=0;i<s.length();i++)
       {
        char g=s.charAt(i);
        char k=Character.toLowerCase(g);
        if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
        {
            vow.add(g);
            sb.setCharAt(i,'*');
        }
       }
       Collections.sort(vow);
       String ans="";
       int k=0;
       for(int i=0;i<sb.length();i++)
       {
        if(sb.charAt(i)=='*')
        {
            ans=ans+vow.get(k);
            k++;
        }
        else
        {
            ans=ans+sb.charAt(i);
        }
       }
return ans;
    }
}