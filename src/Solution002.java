/**
 * 2. Add Two Numbers
 * tc: O(n)
 * sc: O(n)
 */

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
public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode point = output;
        boolean lead = false;
        while(l1!=null || l2!=null) {
            point.next = new ListNode(0);
            point = point.next;
            if(l1!=null) {
                point.val+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                point.val+=l2.val;
                l2 = l2.next;
            }
            if(lead){
                lead = false;
                point.val++;
            }
            if(point.val>=10) {
                lead = true;
                point.val-=10;
            }
        }
        if(lead) {
            point.next = new ListNode(1);
        }
        return output.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
