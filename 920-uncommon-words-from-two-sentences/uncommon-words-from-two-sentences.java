class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[]st=s1.split(" ");
        String[]st1=s2.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<st.length;i++)
        {
            if(!hm.containsKey(st[i]))
            {
                hm.put(st[i],1);
            }
            else
            {
                hm.put(st[i],hm.get(st[i])+1);
            }
        }
         for(int i=0;i<st1.length;i++)
        {
            if(!hm.containsKey(st1[i]))
            {
                hm.put(st1[i],1);
            }
            else
            {
                hm.put(st1[i],hm.get(st1[i])+1);
            }
        }

        ArrayList<String>li=new ArrayList<>();
        for(int i=0;i<st.length;i++)
        {
            if(hm.get(st[i])==1)
            {
                li.add(st[i]);
            }
        }
        for(int i=0;i<st1.length;i++)
        {
            if(hm.get(st1[i])==1)
            {
                li.add(st1[i]);
            }
        }
         String[] str=new String[li.size()];
         for(int i=0;i<li.size();i++)
         {
            str[i]=li.get(i);
         }
     return str;
        
    }
}