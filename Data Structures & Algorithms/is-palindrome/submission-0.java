class Solution {
    public boolean isPalindrome(String s) {
          
           String fixedString = "" ; 

           for(char c : s.toCharArray()) { 
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixedString+=c ;
            }
           } 

           fixedString = fixedString.toLowerCase(); 
           int point_a = 0 ; 
           int point_b = fixedString.length() -1 ; 

           while(point_a <= point_b){
          if(fixedString.charAt(point_a) != fixedString.charAt(point_b)){
                return false ;
            }
            point_a += 1 ; 
            point_b -= 1 ; 
           }

          return true ;
    }
}
