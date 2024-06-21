class Solution {
    public int secondHighest(String s) {
    ArrayList<Integer>li=new ArrayList<>();
    for(Character ch:s.toCharArray())
    {
        if(Character.isDigit(ch))
        {
            
            li.add(ch - '0');
        }
    }
    Collections.sort(li);
    Set<Integer>st=new HashSet<>();
    for(Integer k:li)
    {
        st.add(k);
    }
    Collections.fill(li,-1);
    for(Integer kl:st)
    {
        li.add(kl);
    }
    Collections.sort(li);
    if(li.size()<2)
    {
        return -1;
    }
    else
    {
        return li.get(li.size()-2);
    }
        
    }
}