class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        int mx = 0;
        while (prev != null) {
            int csum = head.val + prev.val;
            mx = Math.max(mx, csum);
            head = head.next;
            prev = prev.next;
        }

        return mx;
    }
}
