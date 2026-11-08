class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (hash.containsKey(needed)) {
                return new int[] {
                     hash.get(needed), i
                };
            } else {
                hash.put(nums[i], i);
            }
        }
        return null;
    }
}
