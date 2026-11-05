class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }


}

class LinkedList {
    ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public int get(int index) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            if (count == index) {
                return current.val;
            }

            count++;
            current = current.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        if (this.head == null) {
            this.head = new ListNode(val);
        } else {
            ListNode current = this.head;
            ListNode newHead = new ListNode(val);
            newHead.next = current;
            this.head = newHead;
        }
    }

    public void insertTail(int val) {
        ListNode tail = this.head;

        if (tail == null) {
            this.head = new ListNode(val);
        } else {
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = new ListNode(val);
        }
    }

    public boolean remove(int index) {
        if(index == 0) {
            if (this.head == null) return false;
            this.head = this.head.next;
            return true;
        }

        int count = 0;
        ListNode current = this.head;
        ListNode previous = null;

        while (current != null) {
            if (count == index) {
                previous.next = current.next;
                return true;
            }

            count++;
            previous = current;
            current = current.next;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ListNode current = this.head;

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        return values;
    }
}
