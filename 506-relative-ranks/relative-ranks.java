class Solution {
    public String[] findRelativeRanks(int[] score) {
     ArrayList<Integer>li=new ArrayList<>();
    for(int i=0;i<score.length;i++)
    {
        li.add(score[i]);
    }
     Collections.sort(li);
     Collections.reverse(li);
     String [] res=new String[li.size()];
     HashMap<Integer,String>hm=new HashMap<>();
     String[]rank={"Gold Medal","Silver Medal","Bronze Medal","4","5"};
     int j=0;
     for(int i=0;i<li.size();i++)
     {
        if(j<3)
        {
             if(!hm.containsKey(li.get(i)))
           {
            hm.put(li.get(i),rank[j]);
            j++;
           }

        }
        else
        {
            hm.put(li.get(i),Integer.toString(j+1));
            j++;
        }
          
     }
 for(int i=0;i<score.length;i++)
 {
    res[i]=hm.get(score[i]);
 }
   return res;
    

    }
}