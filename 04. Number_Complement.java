class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                result += Math.pow(2, s.length() - 1 - i);
            }
        }
        return result;
    }
}
