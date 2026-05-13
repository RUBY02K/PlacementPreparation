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
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null ){
            return head ; 
        }

        ListNode left = head ; 
        ListNode result = null ; 
        int size = k ; 
        ListNode prevleft = null ; 

        while(true){

            ListNode right = left; 

            for (int i = 0 ; i < size-1; i ++){
                if(right == null){
                    break;
                }  
                right = right.next ; 
            }

            if(right != null){

                ListNode nextLeft = right.next; 

                reverse(left, size);

                if(prevleft != null){
                    prevleft.next = right;
                }

                left.next = nextLeft;

                if(result == null){
                    result = right;
                }

                prevleft = left;
                left = nextLeft;

                if(left == null){
                    break;
                }

            }
            else {

                if(prevleft != null){
                    prevleft.next = left ;
                }

                if(result == null){
                    result = left;
                }

                break ; 
            }
        }

        return result ; 
    }

    public void reverse(ListNode left , int size){

        ListNode curr = left ; 
        ListNode prev = null;

        while(size > 0){

            ListNode nexxt = curr.next;

            curr.next = prev ;

            prev = curr ; 

            curr = nexxt;

            size--;
        }
    }
}

        
   