class Solution {
    public int firstUniqChar(String s) {
        int arr[]= new int[26];   //creating array to store 26 letters
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)- 'a']++;    //updating frequency of letter
        }
        for(int j=0; j<s.length(); j++){
            if(arr[s.charAt(j)-'a']==1){    //first unique letter
                return j;
            }
        }
        return -1;
    }
}
