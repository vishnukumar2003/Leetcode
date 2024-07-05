class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
     ArrayList <Integer> li=new ArrayList<>();
     for(int i=left;i<=right;i++) 
     {
       
        if(div(i))
        {
            li.add(i);
        }
        
     } 
     return li; 
    }
    public static boolean div(int k)
    {
        int h=k;
        if(h<=9)
        {
            return true;
        }
       
        String s=Integer.toString(k);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int l=ch[i]-'0';
            if(l==0)
            {
                return false;
            }
            if(h%l==0)
            {
                continue;
            }
            else
            {
                return false;
            }
            

        }
        return true;
    }
}