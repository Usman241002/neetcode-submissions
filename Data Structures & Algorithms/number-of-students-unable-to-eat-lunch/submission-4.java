
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int rotations = 0;
        int sandwichIndex = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            queue.offer(student);
        }

        while (!queue.isEmpty() && rotations < queue.size()) {
            if (queue.peek() == sandwiches[sandwichIndex]) {
                queue.poll();
                rotations = 0;
                sandwichIndex++;
            } else {
                queue.offer(queue.poll());
                rotations++;
            }
        }
            return queue.size();

    }
}