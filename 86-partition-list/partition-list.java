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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserList=new ListNode(0);
        ListNode greaterList=new ListNode(0);
        ListNode sptr=lesserList;
        ListNode gptr=greaterList;

        while(head != null){
            if(head.val<x){
                sptr.next=head;
                sptr=sptr.next;
            }
            else{
                gptr.next=head;
                gptr=gptr.next;
            }
            head=head.next;
        }
        gptr.next=null;
        sptr.next=greaterList.next;
        return lesserList.next; 
    }
}