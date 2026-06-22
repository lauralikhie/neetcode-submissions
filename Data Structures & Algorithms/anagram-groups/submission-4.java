class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>() ; 
        
        for(String str : strs ) {  
            char[] keyArr = str.toCharArray() ; 
            Arrays.sort(keyArr) ; 
            String key = String.valueOf(keyArr);
             if(!myMap.containsKey(key) ){  
                  myMap.put(key , new ArrayList() ) ; 
             }
             
                 myMap.get(key).add(str) ; 
             
        }

        return new ArrayList(myMap.values() )  ;

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
