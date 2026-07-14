class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        /*we need two index that add up to target
            we have current index and target
            we find the difference and check if that is in the map*/
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new RuntimeException("no match found");
    }
}
