class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>() ;
        String key; 
        for(String str : strs){
            char[] strAr = str.toCharArray(); 
            Arrays.sort(strAr); 
            key = String.valueOf(strAr) ;
            if(!map.containsKey(key)){
                map.put(key , new ArrayList());
            }
            map.get(key).add(str); 
        }
        return new ArrayList<>(map.values());
    }
}
