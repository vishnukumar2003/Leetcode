class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String h=paragraph.toLowerCase();
        h=h.replaceAll("[^a-z]"," ");
        String s[]=h.split("\\s+");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String sk:s)
        {
            if(!hm.containsKey(sk))
            {
                hm.put(sk,1);
            }
            else
            {
                hm.put(sk,hm.get(sk)+1);
            }
        }
      ArrayList<String>ar=new ArrayList<>(hm.keySet());
      ar.sort(Comparator.comparing(hm::get));
      Collections.reverse(ar);
    HashMap<String,Integer>hk=new HashMap<>();
    for(String v:banned)
    {
        if(!hk.containsKey(v))
        {
           hk.put(v,1);
        }
        else
        {
            hk.put(v,hk.get(v)+1);
        }
        
    }
    
    for(int i=0;i<ar.size();i++)
    {
        if(!hk.containsKey(ar.get(i)))
        {
           return ar.get(i);
        }
    }
    return "";

    }
}