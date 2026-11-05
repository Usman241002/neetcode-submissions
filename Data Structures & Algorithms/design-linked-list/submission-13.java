class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int get(int index) {
        int counter = 0;
        ListNode current = this.head;

        while (current != null) {
            if (counter == index) {
                return current.val;
            }

            counter++;
            current = current.next;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);

        if (this.head == null) {
            this.tail = newHead;
        } else {
            ListNode currentHead = this.head;
            newHead.next = currentHead;
            currentHead.prev = newHead;
        }

        this.head = newHead;
        length++;
    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);

        if (this.tail == null) {
            this.head = newTail;
        } else {
            ListNode currentTail = this.tail;
            newTail.prev = currentTail;
            currentTail.next = newTail;
        }

        this.tail = newTail;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length)
            return;
        else if (index == 0) {
            this.addAtHead(val);
            return;
        } else if (index == length) {
            this.addAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        int counter = 0;
        ListNode current = this.head;
        ListNode previous = null;

        while (current != null) {
            if (counter == index) {
                previous.next = newNode;
                newNode.prev = previous;
                newNode.next = current;
                current.prev = newNode;
                length++;

                return;
            }

            counter++;
            previous = current;
            current = current.next;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length)
            return;

        int counter = 0;
        ListNode current = this.head;
        ListNode previous = null;
        ListNode next = current.next;
        while (current != null) {
            if (counter == index) {
                if (previous == null) {
                    this.head = next;

                    if (next == null) {
                        this.tail = null;
                    } else {
                        next.prev = null;
                    }

                } else if (next == null) {
                    previous.next = null;
                    this.tail = previous;
                } else {
                    previous.next = next;
                    next.prev = previous;
                }

                length--;
                return;
            }

            counter++;
            previous = current;
            current = next;
            next = next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */