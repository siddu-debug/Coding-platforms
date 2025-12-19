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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(99);
        dummy.next=head;

        int lenLL=0;
        ListNode temp=head;
        while(temp!=null){
            lenLL++;
            temp=temp.next;
        }
    
    ListNode ptr=dummy;
    int jump=lenLL-n;
    while(jump>0){
        ptr=ptr.next;
        jump--;
    }
    ptr.next=ptr.next.next;
    return dummy.next;
        
    }
}