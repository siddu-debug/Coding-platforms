class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int n = 0;

        while (temp.next != null) {
            n++;
            temp = temp.next;
        }

        temp.next = head;
        k = k % (n + 1);

        int jump = n - k;
        ListNode p = head;

        while (jump > 0) {
            p = p.next;
            jump--;
        }

        ListNode res = p.next;
        p.next = null;

        return res;
    }
}