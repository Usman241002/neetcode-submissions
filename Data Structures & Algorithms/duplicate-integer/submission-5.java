class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numHash = new HashMap<Integer, Integer>();

        for (int num : nums) {

            if(numHash.get(num) != null) {
                return true;
            }

            numHash.put(num, 1);
        }

        return false;
    }
}