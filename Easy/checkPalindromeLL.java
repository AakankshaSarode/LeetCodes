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
    public boolean isPalindrome(ListNode head) {
         if(head==null && head.next==null){
             return true;
         }
          ListNode temp=head;
           int count=0;
            while(temp!=null){
                 count++;
                  temp= temp.next;

            }
             int arr[]= new int[count];
              temp=head;
              int i=0;
                while(temp!=null){
                     arr[i]=temp.val;
                     i++;
                      temp=temp.next;
                }
                 i=0;
                  int j=count-1;
                   while(j>i){
                     if(arr[i]!=arr[j]){
                         return false;
                     }
                      i++;
                      j--;

                   }
                    return true;
          
    }
}