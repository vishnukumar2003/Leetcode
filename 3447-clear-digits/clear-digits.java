class Solution {
    public String clearDigits(String s) {
    Stack<Character>st=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            if(!st.isEmpty())
            {
                  st.pop();

            }
        
        }
        else
        {
            st.push(s.charAt(i));
            
        }
        
    }  
String s1="";
while(!st.isEmpty())
{
    s1=s1+st.peek();
    st.pop();
}
StringBuilder sb=new StringBuilder(s1);
return (sb.reverse().toString());
    }
}