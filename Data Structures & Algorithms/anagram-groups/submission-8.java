class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        Map<String, List<String>> map = new HashMap<>(); 
        String key; 
        for(String str : strs){
             
            char[] chrArr = str.toCharArray(); 
            Arrays.sort(chrArr) ;
           key = String.valueOf(chrArr);

           if(!map.containsKey(key)){
            map.put(key, new ArrayList()) ;
           }
           map.get(key).add(str); 
        }
        return new ArrayList(map.values()); 
    }
}
