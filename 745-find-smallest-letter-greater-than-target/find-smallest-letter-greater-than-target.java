class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar=(int) target;
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]!=target)
            {
                int k=(int) letters[i];
                if(k>tar)
                {
                    return letters[i];
                }
            }
        }
        return letters[0];
    }
}