class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
            str.append(s.charAt(i));
        str.reverse();
        return str.toString().equals(s);
    }
}
