class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.equals(""))
        {
            return 0;
        }
        
        String s1[]=s.split("\\s+");
        return s1.length;
        
    }
}