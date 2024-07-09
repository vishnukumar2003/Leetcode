class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Integer> nap = new HashMap<>();
        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=t.charAt(i)){
                    return false;
                }
            }else{
                if(nap.containsKey(t.charAt(i))){
                    return false;
                }else{
                    map.put(ch, t.charAt(i));
                    nap.put(t.charAt(i), 1);
                }
            }
        }

        return true;
    }
}