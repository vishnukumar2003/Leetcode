class Solution {
    public boolean checkInclusion(String s1, String s2) {
     Map<Character,Integer> need=new HashMap<>();
     Map<Character,Integer> have=new HashMap<>();
     for(int i=0;i<s1.length();i++)
     {
        if(!need.containsKey(s1.charAt(i)))
        {
            need.put(s1.charAt(i),1);
        }
        else
        {
            need.put(s1.charAt(i),need.get(s1.charAt(i))+1);
        }
     }  
int start=0;
int end=0;
while(end<s2.length())
{
    char p=s2.charAt(end);
    if(!need.containsKey(p))
    {
        end=end+1;
        start=end;
        have.clear();
        continue;
    }
     
     if(!have.containsKey(p))
     {
        have.put(p,1);
     }
     else
     {
      have.put(p,have.get(p)+1);
     
     }

     while(have.get(p)>need.get(p))
     {
        char stc=s2.charAt(start);
        have.put(stc,have.get(stc)-1);
        start=start+1;
     }
     int windowsize=end-start+1;
     if(windowsize==s1.length())
     {
        return true;
     }
     end=end+1;
}
return false;
    






    }
}