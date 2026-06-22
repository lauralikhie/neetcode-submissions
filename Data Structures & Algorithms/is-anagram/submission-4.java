class Solution {
    public boolean isAnagram(String s, String t) {  
          
       int[] numchars = new int[26] ;  
        if(s.length() != t.length())  return false ; 

        for( int  i = 0 ; i< s.length(); i++ ){ 
            numchars[s.charAt(i) - 'a' ]++ ; 
            numchars[t.charAt(i) - 'a' ]-- ;
        }

       
        for(int num : numchars)  { 
             if( num != 0 ) return false ;  
        }
      return true ; 
          
    } 
    
 























//  public boolean isAnagram(String s, String t) {
//   int[] numChars = new int[26] ; 
//   if(s.length() != t.length() ) return false ; 
//   for (int i = 0 ; i< s.length()  ; i++ ) {        
//       numChars[ s.charAt(i) -'a'] ++ ; 
//       numChars[t.charAt(i) - 'a'] -- ; 
//   }   
//   for(int count : numChars ) { 
//      if(count != 0 ) { 
//          return false ; 
//      }
//   } 
// return true ;

// }
} 