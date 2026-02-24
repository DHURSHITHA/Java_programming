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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) 
        {
            return head;
        }
        int length=1;
        ListNode tptr=head;
        while(tptr.next!=null)
        {
            tptr=tptr.next;
            length+=1;
        }
        tptr.next=head;
        int move=length-(k%length);
        //ListNode temp=tptr;
        while(move-->0)
        {
            tptr=tptr.next;
        }
        head=tptr.next;
        tptr.next=null;
        return head;
    }
}
