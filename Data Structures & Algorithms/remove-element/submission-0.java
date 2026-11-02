class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int k = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else if (nums[counter] == val) {
                temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
            } 

            counter++;
        }

        return counter;
    }
}