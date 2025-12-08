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
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        while(l1 != null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2=l2.next;
        }
        ListNode dummy=new ListNode(0);
        int cy=0;
        int s=0;

        while(!s1.isEmpty() || !s2.isEmpty() || (cy != 0)){
            s=cy;
            if(!s1.isEmpty()){
                s += s1.pop();
        }
        if(!s2.isEmpty()){
            s += s2.pop();
        }
        dummy.next=new ListNode(s%10, dummy.next);
        cy = s / 10;
        
    }
    return dummy.next;
}
}