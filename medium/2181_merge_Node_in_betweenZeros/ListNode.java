
 //Definition for singly-linked list.
  public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode mod=head.next;
         ListNode nextSum=mod;
          while(nextSum!=null){
             int sum=0;
             while(nextSum.val !=0){
                 sum+=nextSum.val;
                 nextSum=nextSum.next;

             }
              mod.val=sum;
              nextSum=nextSum.next;

               mod.next=nextSum;
                mod=mod.next;
          }
           return head.next;
        
    }
}