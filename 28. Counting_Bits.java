class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for(int i = 1; i < num + 1; i++) ans[i] = ans[i & (i - 1)] + 1;
        return ans;
    }
}

/*
    In order to remove the least-significant bit for any number “n” just take its “and(&)” with “n - 1”.
Now since the numbers “n” and “( n & ( n - 1 ) )” differs only by one bit, we can use the result obtained for “( n & ( n - 1 ) )” and add one to it to obtain the result for “n”.
*/
