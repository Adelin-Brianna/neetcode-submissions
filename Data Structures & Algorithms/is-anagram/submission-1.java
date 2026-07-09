class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> res = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(res.containsKey(s.charAt(i))){
                int freq = res.get(s.charAt(i));
                res.put(s.charAt(i), ++freq);
            }
            else{
                res.put(s.charAt(i), 1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(res.containsKey(t.charAt(i))){
                int freq = res.get(t.charAt(i));
                res.put(t.charAt(i), --freq);
            }
            else{
                res.put(t.charAt(i), 1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(res.get(s.charAt(i))!=0)
                return false;
        }
        return true;
    }
}
