class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1; 


        while(left <= s.length() -1) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
