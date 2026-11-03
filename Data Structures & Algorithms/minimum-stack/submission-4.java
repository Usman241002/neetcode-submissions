class MinStack {
    private Stack<Integer> min;
    private Stack<Integer> stack;
    public MinStack() {
        this.stack = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            this.min.push(val);
        } else {
            int minTop = min.peek();
            if (val <= minTop) {
                this.min.push(val);
            }
        }

        this.stack.push(val);
    }

    public void pop() {
        if (min.peek().equals(stack.peek())) {
            min.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
