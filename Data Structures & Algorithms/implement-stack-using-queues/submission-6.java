class MyStack {
    Queue<Integer> main;
    Queue<Integer> temp;
    int size;

    public MyStack() {
        this.temp = new LinkedList<Integer>();
        this.main = new LinkedList<Integer>();
        this.size = 0;
    }

    public void push(int x) {
        this.temp.offer(x);

        for (int i = 0; i < this.size; i++) {
            this.temp.offer(this.main.peek());
            this.main.poll();
        }

        this.size++;

        for(int j = 0; j < this.size; j++) {
            this.main.offer(this.temp.peek());
            this.temp.poll();
        }
    }

    public int pop() {
        int data = this.main.poll();
        this.size--;
        return data;
    }

    public int top() {
        int data = this.main.peek();
        return data;
    }

    public boolean empty() {
        return this.size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */