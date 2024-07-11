class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>li=new ArrayList<>();
        gene(li,0,0,n,"");
        return li;
    }
    public static void gene(List<String> li,int op,int cl,int max,String s)
    {
        if(s.length()==2*max)
        {
            li.add(s);
        return ;
        }
        if(op<max)
        {
            gene(li,op+1,cl,max,s+'(');
        }
        if(cl<op)
        {
            gene(li,op,cl+1,max,s+')');
        }
    }
}