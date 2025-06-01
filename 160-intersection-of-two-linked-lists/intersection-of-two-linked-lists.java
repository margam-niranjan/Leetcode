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
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int acount = 0;
        int bcount = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a != null){
            acount++;
            a = a.next;
        }
        while(b != null){
            bcount++;
            b = b.next;
        }
        while(acount > bcount){
            acount--;
            headA = headA.next;
        }
        while(bcount > acount){
            bcount--;
            headB = headB.next;
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}