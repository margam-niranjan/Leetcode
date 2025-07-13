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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;
        ListNode node1 = head;
        ListNode node2 = head.next;
        while (node2 != null) {
            int gcdValue = calculateGCD(node1.val, node2.val);
            ListNode gcdNode = new ListNode(gcdValue);

            node1.next = gcdNode;
            gcdNode.next = node2;

            node1 = node2;
            node2 = node2.next;
        }

        return head;
    }
    int calculateGCD(int x , int y){
        if(x == 0) return y;
        return calculateGCD(Math.abs(x-y),Math.min(x,y));
    }
}