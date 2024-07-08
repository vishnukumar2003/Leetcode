class Solution {
    public boolean rotateString(String s, String goal) {
        ArrayList<Character>li=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            li.add(s.charAt(i));
        }
        ArrayList<Character>l2=new ArrayList<>();
        for(int i=0;i<goal.length();i++)
        {
            l2.add(goal.charAt(i));
        }
        int i=0;
        int j=0;
       while(j<l2.size())
        {
            char c=li.get(i);
            li.remove(i);
            li.add(c);
            if(li.equals(l2))
            {
                return true;
            }
            j++;
        }
        return false;
    }
}