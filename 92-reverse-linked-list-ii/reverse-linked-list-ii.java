/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(99);
        dummy.next=head;
        ListNode leftptr=dummy;
        ListNode curr=head;

        for(int i=0;i<left-1;i++){
            leftptr=leftptr.next;
            curr=curr.next;

        }
        ListNode pre=null;
        ListNode shead=curr;
        for(int i=0;i<right-left + 1;i++){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        leftptr.next=pre;
        shead.next=curr;
        return dummy.next;


        
    }
}