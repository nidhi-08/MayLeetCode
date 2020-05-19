/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;  
        int end = n;  
        int middle;  
        while(start <= end){  
            middle = ((end - start)/2) + start;  
            if (isBadVersion(middle)){
                end = middle - 1; 
            }  
            else 
                start = middle + 1;  
        }  
        return end + 1;  
    }
}
