class Solution {

private final char DELIMITER = '#' ; 

    public String encode(List<String> strs) {
        StringBuilder sb  = new StringBuilder() ;
        for(String str : strs) { 
            sb.append(str.length()).append(DELIMITER).append(str) ;
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>() ;
        char[] arr = str.toCharArray() ; 
        for(int i = 0 ; i< arr.length ; i++ ) { 
            StringBuilder sb = new StringBuilder() ;
            while(arr[i] != DELIMITER ){ 
                sb.append(arr[i++]) ;
             }
             i++ ; 
             int numOfChar = Integer.valueOf(sb.toString()) ;
             int end = i+numOfChar ;
             sb = new StringBuilder() ;
             while(i<end){ 
                sb.append(arr[i++]) ;
             }
             i-- ;
             res.add(sb.toString());
        }
        return res;
    }
}
