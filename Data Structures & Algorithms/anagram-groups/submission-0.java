class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          
          Map<String, List<String>> myMap = new HashMap<>() ; 
           for(String str  : strs ) { 
            char[] charArr = str.toCharArray() ; 
          Arrays.sort(charArr) ;
String key = String.valueOf(charArr) ; 
            if(!myMap.containsKey(key)){  
            myMap.put(key, new ArrayList()) ;
            } 
            myMap.get(key).add(str) ;
           }
            return new ArrayList<>(myMap.values()) ; 
    }
}   
