class Solution {
    public int countSeniors(String[] details) {
        int count=0;
     for(int i=0;i<details.length;i++)
     {
        String le=details[i].substring(11,13);
        int len=Integer.parseInt(le);
      if(len>60)
      {
        count++;
      }  
     }

return count;
        
    }
}