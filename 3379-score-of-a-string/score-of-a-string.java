class Solution {
    public int scoreOfString(String s) {
      ArrayList<Integer>li=new ArrayList<>();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        int a=ch-'0';
        li.add(a);
      }  
      int sum=0;
      for(int i=0;i<li.size()-1;i++)
      {
        sum=sum+Math.abs(li.get(i)-li.get(i+1));
      }
      return sum;
    }
}