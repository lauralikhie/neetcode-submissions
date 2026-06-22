class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>(); 
        for(String str : strs ) { 
             char[] chrArr = str.toCharArray() ;
             Arrays.sort(chrArr) ; 
             String key = String.valueOf(chrArr) ; 

             if(!anagram.containsKey(key)){ 
                  anagram.put(key, new ArrayList() ) ;
             }
            anagram.get(key).add(str) ;
        }
        return new ArrayList(anagram.values()) ;
    }
}
