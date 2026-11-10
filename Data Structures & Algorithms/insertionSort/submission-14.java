// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int j;
        Pair temp;
        List<List<Pair>> list = new ArrayList<List<Pair>>();
        if(pairs.isEmpty()) {
            return list;
        }
        list.add(new ArrayList<Pair>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            j = i - 1;

            while (j >= 0 && pairs.get(j + 1).key < pairs.get(j).key) {
                temp = pairs.get(j + 1);
                pairs.set(j + 1, pairs.get(j));
                pairs.set(j, temp);
                j--;
            }

            list.add(new ArrayList<Pair>(pairs));
        }

        return list;
    }
}
