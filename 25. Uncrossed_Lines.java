class Solution {
    //We have to maintain a 2-dimensional DP array as we have two unique states in recursion i.e. “i” and “j”.
    //In bottom’s up DP we have to fill the dp array line by line.
    
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] dp = new int[A.length + 1][B.length + 1];
        
        for(int i = A.length - 1; i >= 0; i--){     //bottom down approach
            for(int j = B.length - 1; j >= 0; j--){
                dp[i][j] = (A[i] == B[j] 
                                ? dp[i + 1][j + 1] + 1 
                                : Math.max(dp[i][j + 1], dp[i + 1][j]));
            }
        }
        /*
        for current (i, j) exists in the dp array or not, in case it does we will simply return the value stored         in the dp array in case it doesn’t we have to evaluate the value using recursion and then store it in             the current dp state i.e. dp[i][j].
         */
        return dp[0][0];
    }
}
