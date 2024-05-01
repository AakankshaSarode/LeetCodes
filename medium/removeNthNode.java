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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
         ListNode temp=head;
          while(temp!=null){
            temp=temp.next;
            size++;
          } temp=head;
           if(n==size){
              head=head.next;
               return head;
           }
            int toDelete= size-n-1;
             int i=0;
              while(i!=toDelete){
                 i++;
                  temp=temp.next;

              }
              temp.next=temp.next.next;
              return head;
    }
}