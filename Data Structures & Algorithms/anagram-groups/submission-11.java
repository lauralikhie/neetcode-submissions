class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>() ; 

        for(String str : strs){
            char[] sortedArr = str.toCharArray() ;
            Arrays.sort(sortedArr); 
            String sorted = String.valueOf(sortedArr); 

        map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str); 
        }  
        return new ArrayList<>(map.values()); 
    }
}
