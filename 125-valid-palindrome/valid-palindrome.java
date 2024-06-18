import java.io.*;
class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i))) 
            {
               s1=s1+s.charAt(i);
            }
           
        }
        String s3=s1.toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(s3);
        sb.reverse();
        String s4=sb.toString();
        if(s3.equals(s4))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}