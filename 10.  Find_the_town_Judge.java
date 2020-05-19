class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==1){
            return 1;
        }
        if(trust.length<N-1){
            return -1;
        }
        
        int a[] = new int[N+1]; //array trusts
        int b[] = new int[N+1]; //array is trusted
        for(int i=0;i<trust.length;i++){
            a[trust[i][0]]++;
            b[trust[i][1]]++;
        }
        for(int i=0;i<N+1;i++){
            if(a[i]==0 && b[i]== N-1){  //noone trusts and is trusted by all
                return i;
            }
        }
        return -1;
    }
}
