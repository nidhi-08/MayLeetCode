class Solution {
    public int findMaxLength(int[] nums) {
        int count=0; int len=0;
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        for(int i=index_start;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            if(nums[i]==1){
                count--;
            }
            if (arr[count + nums.length] >= -1) {
                len = Math.max(len, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }
        }
    return len;
    }
}
