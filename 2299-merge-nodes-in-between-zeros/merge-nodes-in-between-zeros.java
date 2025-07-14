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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode dummyNode = new ListNode(-1);
        ListNode tail = dummyNode;

        int sum = 0;
        ListNode temp = head.next;

        while(temp!=null){

            if(temp.val!=0){
                sum += temp.val;
            }else{
                ListNode curr = new ListNode(sum);
                tail.next = curr;
                tail = tail.next;
                sum = 0;
            }
            temp = temp.next;
        }
        return dummyNode.next;
    }
}