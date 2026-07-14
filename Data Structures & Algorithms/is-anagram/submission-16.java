class Solution {
    public boolean isAnagram(String s, String t) {
        int[] intArr = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            intArr[s.charAt(i) - 'a']++;
            intArr[t.charAt(i) - 'a']--;
        }
        for (int num : intArr) {
            if (num != 0)
                return false;
        }
        return true;
    }
}
