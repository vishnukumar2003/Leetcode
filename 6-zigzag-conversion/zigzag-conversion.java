class Solution {
    public String convert(String s, int numRows) {
        char arr[][]=new char[numRows][s.length()];
        int row=0;
        int col=0;
        int cur=0;
        while(cur<s.length())
        {
            while(row<numRows && cur<s.length())
            {
                arr[row++][col]=s.charAt(cur++);
            }
            row=Math.max(0,row-2);
            while(row>0 && cur<s.length())
            {
                arr[row--][++col]=s.charAt(cur++);
            }
            col++;
        }
       
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[i][j] != '\u0000') { // Exclude uninitialized elements
                    ans.append(arr[i][j]);
                }
            }
        }
        return ans.toString();
    }
}