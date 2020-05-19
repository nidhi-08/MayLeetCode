class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length -1;
      
        while(start<end){
            int mid= start +(end-start)/2;
            
            if(mid%2==0){
                if( nums[mid]==nums[mid+1] && mid+1<nums.length){
                    start=mid+2;
                }
                else
                    end=mid-1;
            }
            
            else   { //if mid is odd
                    if( nums[mid]==nums[mid-1] && mid-1>=0){
                       start=mid+1;
                    }
                    else
                        end=mid;
                }
        }
        
        return nums[start];
        /*  int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
        }
        return a;
 */
    }
}
