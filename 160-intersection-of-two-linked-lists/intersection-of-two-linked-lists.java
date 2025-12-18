/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        int lenA=0;
        int lenB=0;
        while(p1 != null){
            lenA++;
            p1=p1.next;
        }
        while(p2 != null){
            lenB++;
            p2=p2.next;
        }
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }
        while(headA != null){
            if(headA==headB){
                return headB;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}