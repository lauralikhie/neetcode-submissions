class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums) ; 
        for(int i = 0 ; i < nums.length-1 ; i++) { 
             if(nums[i] == nums[++i])  return true ;
        }
        return false ; 
    }
}
