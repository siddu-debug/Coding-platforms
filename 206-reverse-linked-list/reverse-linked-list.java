class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();

        // Push all nodes' values into the stack
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }

        // Dummy node to build reversed list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Pop values to build reversed list
        while (!s.isEmpty()) {
            curr.next = new ListNode(s.pop());
            curr = curr.next;
        }

        return dummy.next;   // CORRECT RETURN
    }
}
