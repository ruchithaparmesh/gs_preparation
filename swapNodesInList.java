//1721. Swapping Nodes in a Linked List
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
    public ListNode swapNodes(ListNode head, int k) {
        //System.out.println("Head val and head.next "+head.val+" "+head.next.val);
        ListNode begin=head;
        ListNode end=head;
       
        ListNode n=head;
        for(int i=0;i<k-1;i++)
        {
            begin=begin.next;
            n=begin;
        }
      
         while(begin.next!=null)
        {
            begin=begin.next;
            end=end.next;
        }
             

        int bv=n.val;
        n.val=end.val;
        end.val=bv;
        return head;
    }
}