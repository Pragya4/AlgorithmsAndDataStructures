/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode curnode=A;
        ListNode prev=null;
        ListNode nextnode=null;
        int count=0;
            while(count<B && curnode!=null){
                count++;
                nextnode=curnode.next;
                curnode.next=prev;
                prev=curnode;
                curnode=nextnode;
   //             System.out.println(prev.val+" "+curnode.val+" "+nextnode.val+" ");
            }
        if(nextnode!=null){
            A.next=reverseList(nextnode,B);
        }
        return prev;
    }
}

