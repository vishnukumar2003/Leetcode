class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character>li=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            char k=sb.charAt(i);
            char l=Character.toLowerCase(k);
            if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
            {
                li.add(k);
                sb.setCharAt(i,'*');
            }
        }
        Collections.reverse(li);
        int p=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='*')
            {
                sb.setCharAt(i,li.get(p));
                p++;
            }
        }
        return sb.toString();
    }
}