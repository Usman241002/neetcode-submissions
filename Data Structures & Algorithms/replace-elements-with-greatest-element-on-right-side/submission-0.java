class Solution {
    public int[] replaceElements(int[] arr) {
        int great = -1;
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > great) {
                temp = arr[i];
                arr[i] = great;
                great = temp;
            } else {
                arr[i] = great;
            }
        }
        return arr;
    }
}