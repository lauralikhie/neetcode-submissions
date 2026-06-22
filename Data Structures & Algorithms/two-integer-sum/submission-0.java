class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> num_Map = new HashMap<>() ; 
          
          for(int i = 0 ; i< nums.length; i++) { 
            int compliment = target - nums[i]  ;
             if(num_Map.containsKey(compliment)){ 
                return new int[]{num_Map.get(compliment) , i } ; 
             }
              else { 
                 num_Map.put(nums[i] , i) ; 
              }
          } 
          throw new IllegalArgumentException("no match found")  ;
    }
}
