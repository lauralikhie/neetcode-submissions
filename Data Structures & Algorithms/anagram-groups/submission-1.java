class Solution {
      public List<List<String>> groupAnagrams(String[] strs) { 
        Map<String , List<String>> myMap = new HashMap<>() ; 
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr) ; 
            String Key = String.valueOf(charArr) ; 
            if(!myMap.containsKey(Key)){
                myMap.put(Key, new ArrayList()) ;
            }
            myMap.get(Key).add(str) ;
        }
        return new ArrayList(myMap.values()) ;
    } 
}
  