//2. Add Two Numbers

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
     
        ListNode head=null;
        ListNode temp=null;
        
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            sum=carry;
           if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
           }
            
           if(l2!=null) {    
            sum+=l2.val;
            l2=l2.next;
             }      
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            if(temp==null)
            {
                temp=head=newNode;
            }
               else{ temp.next=newNode;
                temp=temp.next;}
            
            
        } 
            if (carry > 0) {
              temp.next = new ListNode(carry);
            }
        return head; 
        }
        
}
