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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode h1= head;
        ListNode h2=head.next;
        
        ListNode even=h2;
        
        while(h1.next!=null && h2.next!=null){
            h1.next=h2.next;
            h1=h1.next;
            h2.next=h1.next;
            h2=h2.next;
        }
        h1.next=even;
        return head;
    }
}
