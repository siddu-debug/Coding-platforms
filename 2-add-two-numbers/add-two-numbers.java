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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode ptr=res;
        int cy=0;
        while(l1 != null || l2 != null){
            int s=cy;
            if(l1 != null){
                s += l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                s +=l2.val;
                l2=l2.next;
            }
            res.next=new ListNode( s % 10);
            cy = s / 10;
            res = res.next;

            
        }
        if(cy > 0){
            res.next=new ListNode(cy);
        }
        return ptr.next;


        
        
    }
}