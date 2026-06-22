class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>() ; 

        for( String str : strs) { 
           char[] chr =  str.toCharArray() ; 
           Arrays.sort(chr) ; 
           String key = String.valueOf(chr) ; 
        
        if(!myMap.containsKey(key)){ 
             myMap.put(key , new ArrayList()) ;
        }
         myMap.get(key).add(str) ;
        }
        return new ArrayList(myMap.values()) ;
    }
}



















//         Map<String, List<String>> myMap = new HashMap<>() ;
//         for(String str : strs){
//             char[] chAr = str.toCharArray() ;
//             Arrays.sort(chAr);
//             String key = String.valueOf(chAr);
//             if(!myMap.containsKey(key)){
//                 myMap.put(key, new ArrayList());
//             }
//             myMap.get(key).add(str) ;
//         }
//         return new ArrayList(myMap.values());
//     }
// }
