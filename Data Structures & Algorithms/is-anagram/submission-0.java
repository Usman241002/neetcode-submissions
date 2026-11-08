class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hash2 = new HashMap<Character, Integer>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(hash1.get(s.charAt(i)) == null) {
                hash1.put(s.charAt(i), 1);
            } else {
                hash1.put(s.charAt(i), hash1.get(s.charAt(i)) + 1);
            }

            if(hash2.get(t.charAt(i)) == null) {
                hash2.put(t.charAt(i), 1);
            } else {
                hash2.put(t.charAt(i), hash2.get(t.charAt(i)) + 1);
            }
        }

        return hash1.equals(hash2);



    }
}
