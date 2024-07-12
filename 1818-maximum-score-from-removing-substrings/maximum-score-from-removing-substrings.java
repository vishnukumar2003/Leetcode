class Solution {
    public int maximumGain(String s, int x, int y) {
        
        int res=0;
        int res1=0;
           res=score('b','a',y,x,0,s);
          res1=score('a','b',x,y,0,s);
   
      return Math.max(res,res1);
    }
    public static int score(char sd,char et,int f,int g,int a,String s)
    {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else if(st.peek()==sd && s.charAt(i)==et)
            {
                st.pop();
                a=a+f;
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        ArrayList<Character>li=new ArrayList<>();
        while(!st.isEmpty())
        {
            li.add(st.pop());
            
        }
        Collections.reverse(li);
        Stack<Character>tt=new Stack<>();
        for(int i=0;i<li.size();i++)
        {
            if(tt.isEmpty())
            {
                tt.push(li.get(i));

            }
            else if(tt.peek()==et && li.get(i)==sd)
            {
                a=a+g;
                tt.pop();
            }
            else
            {
                tt.push(li.get(i));
            }
        }
        return a;
    }
}








