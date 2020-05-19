class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null){
            return s2 == null;
        }
        if (s1.equals(s2)){
            return true;
        }
        if (s1.length() > s2.length()){
            return false;
        }
        int[] cnt = new int[26];    //count to store freq of chars
        for (char c : s1.toCharArray()) { 
            cnt[c - 'a']++;   //updating freq
        }
        int l = 0;  
        int r = 0;
        int len = s1.length();
        int count = len;
        while (r < s2.length()) {   //while right is less than length
            if (cnt[s2.charAt(r++) - 'a']-- > 0) {    //if freq of next char is greater than zero
                count--;    //decrement count
            }
            if (count == 0){
                return true;
            }
            if (r - l == len && cnt[s2.charAt(l++) - 'a']++ >= 0) {
                count++;
            }
        }
        return false;
    }
}
