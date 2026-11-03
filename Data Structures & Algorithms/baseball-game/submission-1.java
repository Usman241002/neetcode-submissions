class Solution {
    public int calPoints(String[] operations) {
        int total = 0;
        ArrayList<Integer> scores = new ArrayList<Integer>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            switch (op) {
                case "+":
                    scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
                    break;
                case "C":
                    scores.remove(scores.size() - 1);
                    break;
                case "D":
                   scores.add(scores.get(scores.size() - 1) * 2);
                    break;
                default:
                    scores.add(Integer.parseInt(op));
                    break;
            }
        }

        for (int j = 0; j < scores.size(); j++) {
            total += scores.get(j);
        }

        return total;
    }
}