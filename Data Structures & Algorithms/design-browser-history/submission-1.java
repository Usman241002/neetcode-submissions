class ListNode {
    String val;
    ListNode next;
    ListNode prev;

    public ListNode(String val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    ListNode head = null;
    ListNode tail = null;
    ListNode currentNode;
    int forwardSteps = 0;
    int backwardSteps = 0;

    public BrowserHistory(String homepage) {
        ListNode newNode = new ListNode(homepage);
        this.head = newNode;
        this.tail = newNode;
        this.currentNode = this.tail;
    }
    
    public void visit(String url) {
        ListNode newNode = new ListNode(url);
        newNode.prev = this.currentNode;
        this.currentNode.next = newNode;
        this.currentNode = newNode;
        this.forwardSteps = 0;
        this.backwardSteps++;
    }
    
    public String back(int steps) {

        if(steps > this.backwardSteps) {
            steps = this.backwardSteps;
        }

        while(steps > 0 && currentNode.prev != null) {
            this.currentNode = this.currentNode.prev;

            steps--;
            this.backwardSteps--;
            this.forwardSteps++;
        }

        return currentNode.val;
    }
    
    public String forward(int steps) {
        if(steps > this.forwardSteps) {
            steps = this.forwardSteps;
        }

        while(steps > 0 && currentNode.next != null) {
            this.currentNode = this.currentNode.next;

            steps--;
            this.forwardSteps--;
            this.backwardSteps++;
        }

        return currentNode.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */