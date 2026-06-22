class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
          Map<String , List<String>> map = new HashMap<>() ; 

          for(String str : strs) { 
             char[] keyArr = str.toCharArray() ;
             Arrays.sort(keyArr) ; 
             String key = String.valueOf(keyArr) ;
             if(!map.containsKey(key)){
                map.put(key,new ArrayList()) ; 
             }
             map.get(key).add(str) ;
          }
          return new ArrayList(map.values()) ; 
    }
}
