package link_list;

public class ListNode {
    int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static ListNode deleteMiddle(ListNode head,int n) {
        ListNode slow= head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;

            for(int i=0;i<n;i++){
                slow.val=slow.next.val;
                slow.next=slow.next.next;
            }
            return head;
        }

        return slow;
    }

    public static void main(String[] args) {
    }
}

