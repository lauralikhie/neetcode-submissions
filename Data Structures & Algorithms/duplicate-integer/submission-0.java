class Solution {
    public boolean hasDuplicate(int[] nums) { 
        Map<Integer, Integer> num_map = new HashMap<>() ; 

   for(int i = 0 ; i< nums.length ; i++ ) {  
     if(num_map.containsKey(nums[i])) { 
         return true ; 
     }  
     else { 
         num_map.put(nums[i],i) ; 
     }
   }  
   return false ; 
    }
}
