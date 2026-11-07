class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numHash = new HashSet<Integer>();

        for (int num : nums) {

            if(numHash.contains(num)) {
                return true;
            }

            numHash.add(num);
        }

        return false;
    }
}