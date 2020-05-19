class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();       //created list of integers
        int left=0;
        int right=0;
        
        int[] counts = new int[26];     //creating array for 26 characters
        for(char x: p.toCharArray()){
            counts[x-'a']++;            //counting frequency of each character
        }
        while(right<s.length()){        //while right is less than length
            counts[s.charAt(right) - 'a']--;        //decrementing freq in array     
            while(counts[s.charAt(right) -'a']<0)           //if freq is <zero
            {
                counts[s.charAt(left++)-'a']++;     //incrementing left characters freq
            }
            right++;    
            if(right-left==p.length()){
                result.add(left);
            }
                
        }       //end of while loop
        return result;
   }
}
