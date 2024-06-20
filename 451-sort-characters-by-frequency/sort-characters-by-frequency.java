class Solution {
    public String frequencySort(String s) {
     HashMap <Character,Integer> hm=new HashMap<>();
     for(Character ch:s.toCharArray())
     {
        if(!hm.containsKey(ch))
        {
             hm.put(ch,1);
        }
        else
     {
        hm.put(ch,hm.get(ch)+1);
     }
     }      
    ArrayList<Character>li=new ArrayList<>(hm.keySet());
    li.sort(Comparator.comparing(hm::get));
    Collections.reverse(li);
    String res="";
    for(int i=0;i<li.size();i++)
    {
        char cx=li.get(i);
        int ct=hm.get(cx);
        
        for(int j=0;j<ct;j++)
        {
            res+=cx;
        }

    }

    return res;

    }
}