class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(res.containsKey(key))
                res.get(key).add(s);
            else{
                List<String> a1 = new ArrayList<>();
                a1.add(s);
                res.put(key,a1);
            }
        }
        return new ArrayList<>(res.values());
    }
}
