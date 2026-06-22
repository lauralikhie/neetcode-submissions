class Solution {
    public boolean isAnagram(String s, String t) {
     
      if(s.length() != t.length())  return false  ; 

    int[] char_nums = new int[26] ; 

    for(int i = 0 ; i<s.length()  ; i++ ) { 
         char_nums[s.charAt(i)-'a']++ ; 
         char_nums[t.charAt(i)-'a']-- ; 
    }
 for(int count : char_nums) { 
     if(count!= 0) { 
         return false ;
     }
 } 
 return true; 
      } 
}
