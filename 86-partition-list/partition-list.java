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
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode f = first;
        ListNode s = second;
        while(head != null){
            if(head.val < x){
                f.next = head;
                f = f.next;
            }
            else{
                s.next = head;
                s = s.next;
            }
            head = head.next;
        }
        f.next = second.next;
        s.next = null;

        return first.next;
    }
}