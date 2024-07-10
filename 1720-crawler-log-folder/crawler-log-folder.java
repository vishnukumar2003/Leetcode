class Solution {
    public int minOperations(String[] logs) {
     Stack<String>res=new Stack<>();
     for(int i=0;i<logs.length;i++)
     {
       
        if(logs[i].equals("../") &&!res.isEmpty())
        {
            res.pop();
        }
        else if(logs[i].equals("./"))
        {
             continue;
        }
        if(!logs[i].equals("../")&&!logs[i].equals("./"))
        {
            res.push(logs[i]);
        }
       
     } 
     if(res.isEmpty())
     {
        return 0;
     }
     else
     {
         return res.size();  
     }
    
    }
}